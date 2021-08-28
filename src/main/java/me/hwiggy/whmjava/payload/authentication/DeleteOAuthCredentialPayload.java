package me.hwiggy.whmjava.payload.authentication;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/deleteoauthcredential/
 */
public class DeleteOAuthCredentialPayload extends Payload {

    /***
     *
     * @param credentialID The ID of the credential to be deleted
     */
    public DeleteOAuthCredentialPayload(int credentialID) {
        super("DeleteOAuthCredential");
        append("credentialid", credentialID);
    }
}
