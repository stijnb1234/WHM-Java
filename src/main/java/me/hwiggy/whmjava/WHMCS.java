package me.hwiggy.whmjava;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import me.hwiggy.whmjava.payload.Payload;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/***
 * This class is the entrypoint for the WHMCS Accessor
 * The URL parameter should point to a site like the following:
 * https://yourdomain.com/whmcs/api.php
 *
 * The default constructor uses the new version of the WHMCS API, which requires an Identifier and a Secret
 * These semantics are defined at the following URL:
 * https://developers.whmcs.com/api/authentication/
 */
public class WHMCS {
    private final HttpClient client = HttpClient.newHttpClient();
    private final String url, identifier, secret, accessKey;
    private final boolean oldAuth;

    /***
     *
     * @param oldAuth Whether or not to use Username/Password authentication
     * @param url The URL of your WHMCS API Endpoint
     * @param username The Username to authenticate with
     * @param password The Password to authenticate with
     */
    public WHMCS(boolean oldAuth, String url, String username, String password) {
        this.oldAuth = oldAuth;
        this.url = url;
        this.identifier = username;
        this.secret = password;
        this.accessKey = "";
    }

    /***
     *
     * @param oldAuth Whether or not to use Username/Password authentication
     * @param url The URL of your WHMCS API Endpoint
     * @param username The Username to authenticate with
     * @param password The Password to authenticate with
     */
    public WHMCS(boolean oldAuth, String url, String username, String password, String accessKey) {
        this.oldAuth = oldAuth;
        this.url = url;
        this.identifier = username;
        this.secret = password;
        this.accessKey = accessKey;
    }

    /***
     *
     * @param url The URL of your WHMCS API Endpoint
     * @param identifer The Identifier to authenticate with
     * @param secret The Secret to authenticate with
     */
    public WHMCS(String url, String identifer, String secret) {
        this(false, url, identifer, secret);
    }

    /***
     *
     * @param payload The Payload to submit to the API
     * @return The API Response, as JSON
     * @throws IOException if an I/O error occurs when sending or receiving
     * @throws InterruptedException if the operation is interrupted
     * @throws IllegalArgumentException if the {@code request} argument is not
     *         a request that could have been validly built as specified by {@link
     *         HttpRequest.Builder HttpRequest.Builder}.
     * @throws SecurityException If a security manager has been installed
     *          and it denies {@link java.net.URLPermission access} to the
     *          URL in the given request, or proxy if one is configured.
     *          See <a href="#securitychecks">security checks</a> for further
     *          information.
     */
    public JsonObject submitPayload(Payload payload) throws IOException, InterruptedException {
        if (oldAuth) {
            payload.append("username", identifier).append("password", secret);
            if (!accessKey.isEmpty()) payload.append("accesskey", accessKey);
        } else {
            payload.append("identifier", identifier).append("secret", secret);
        }
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(payload.toString()))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        String response = httpResponse.body();
        return JsonParser.parseString(response).getAsJsonObject();
    }
}
