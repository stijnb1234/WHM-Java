package me.hwiggy.whmjava;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import me.hwiggy.whmjava.payload.Payload;
import me.hwiggy.whmjava.util.HttpPostForm;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

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
     * @throws JsonSyntaxException if the response includes malformed json
     */
    public JsonObject submitPayload(Payload payload) throws IOException, JsonSyntaxException {
        if (oldAuth) {
            payload.append("username", identifier).append("password", secret);
        } else {
            payload.append("identifier", identifier).append("secret", secret);
        }

        if (!accessKey.isEmpty()) payload.append("accesskey", accessKey);

        payload.append("responsetype", "json"); //Force JSON, no XML...

        HttpPostForm postForm = new HttpPostForm(url, StandardCharsets.UTF_8);
        payload.getData().forEach(postForm::addFormField);
        String response = postForm.finish();

        return JsonParser.parseString(response).getAsJsonObject();
    }
}
