package me.hwiggy.whmjava.payload.client;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/resetpassword/
 */
public class ResetPasswordPayload extends Payload {
    public ResetPasswordPayload() {
        super("ResetPassword");
    }

    /***
     * @param id    The id of the client to reset. The id can only belong to a client.	
     */
    public ResetPasswordPayload withID(int id) {
        append("id", id);
        return this;
    }

    /***
     * @param email    The email address of the client or contact to update. Either $id or $email is required	
     */
    public ResetPasswordPayload withEmail(String email) {
        append("email", email);
        return this;
    }

    /***
     * @param answer    The answer to the client security question if appropriate	
     */
    public ResetPasswordPayload withAnswer(String answer) {
        append("answer", answer);
        return this;
    }
}
