package me.hwiggy.whmjava.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.*;

/*
 * SOURCE: https://blog.cpming.top/p/httpurlconnection-x-www-form-urlencoded
 */
public class HttpPostForm {
    private final HttpURLConnection httpConn;
    private final Map<String, Object> queryParams;
    private final Charset charset;

    /**
     * This constructor initializes a new HTTP POST request
     * with content type is set to multipart/form-data.
     *
     * @param requestURL  The URL to send the request to.
     * @param charset     The charset of the request values.
     * @param headers     The headers to include in the request.
     * @param queryParams The query parameters to include in the request.
     * @throws IOException If the URL connection failed.
     */
    public HttpPostForm(String requestURL, Charset charset, Map<String, String> headers, Map<String, Object> queryParams) throws IOException {
        this.charset = charset;
        this.queryParams = Objects.requireNonNullElseGet(queryParams, HashMap::new);
        URL url = new URL(requestURL);
        httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setUseCaches(false);
        httpConn.setDoOutput(true);    // indicates POST method
        httpConn.setDoInput(true);
        httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        if (headers != null && headers.size() > 0) {
            for (String key : headers.keySet()) {
                String value = headers.get(key);
                httpConn.setRequestProperty(key, value);
            }
        }
    }

    /**
     * This constructor initializes a new HTTP POST request
     * with content type is set to multipart/form-data.
     *
     * @param requestURL The URL to send the request to.
     * @param charset    The charset of the request values.
     * @param headers    The headers to include in the request.
     * @throws IOException If the URL connection failed.
     */
    public HttpPostForm(String requestURL, Charset charset, Map<String, String> headers) throws IOException {
        this(requestURL, charset, headers, null);
    }

    /**
     * This constructor initializes a new HTTP POST request
     * with content type is set to multipart/form-data.
     *
     * @param requestURL The URL to send the request to.
     * @param charset    The charset of the request values.
     * @throws IOException If the URL connection failed.
     */
    public HttpPostForm(String requestURL, Charset charset) throws IOException {
        this(requestURL, charset, null, null);
    }

    /**
     * Adds a form field to the request.
     *
     * @param name  The name of the field.
     * @param value The value of the field.
     */
    public void addFormField(String name, Object value) {
        queryParams.put(name, value);
    }

    /**
     * Adds a header to the request.
     *
     * @param key   The header key.
     * @param value The header value.
     */
    public void addHeader(String key, String value) {
        httpConn.setRequestProperty(key, value);
    }

    /**
     * Convert the request fields to a byte array.
     *
     * @param params The params fields.
     * @return The byte array to use.
     */
    private byte[] getParamsByte(Map<String, Object> params) {
        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param : params.entrySet()) {
            if (postData.length() != 0) {
                postData.append('&');
            }

            if (param.getValue().getClass().isArray()) {
                int length = Array.getLength(param.getValue());

                for (int i = 0; i < length; i++) {
                    postData.append(this.encodeParam(param.getKey())).append("[").append(i).append("]");
                    postData.append('=');
                    postData.append(this.encodeParam(String.valueOf(Array.get(param.getValue(), i))));
                }
            } else {
                postData.append(this.encodeParam(param.getKey()));
                postData.append('=');
                postData.append(this.encodeParam(String.valueOf(param.getValue())));
            }
        }
        return postData.toString().getBytes(charset);
    }

    /**
     * Performs URL-encoding on the keys and values
     *
     * @param data The input
     * @return The encoded output
     */
    private String encodeParam(String data) {
        return URLEncoder.encode(data, charset);
    }

    /**
     * Completes the request and receives response from the server.
     *
     * @return String as response in case the server returned status OK,
     * otherwise an exception is thrown.
     * @throws IOException When the request failed, with a non-OK status.
     */
    public String finish() throws IOException {
        String response;
        byte[] postDataBytes = this.getParamsByte(queryParams);
        httpConn.getOutputStream().write(postDataBytes);
        // Check the http status
        int status = httpConn.getResponseCode();
        if (status == HttpURLConnection.HTTP_OK) {
            ByteArrayOutputStream result = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = httpConn.getInputStream().read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            response = result.toString(this.charset);
            httpConn.disconnect();
        } else {
            throw new IOException("Server returned non-OK status: " + status);
        }
        return response;
    }
}