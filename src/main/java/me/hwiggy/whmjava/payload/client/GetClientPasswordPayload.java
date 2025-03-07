/**
 * Generated by ramidzkh's awesome generator thingy
 */
package me.hwiggy.whmjava.payload.client;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getclientpassword/
 */
public class GetClientPasswordPayload extends Payload {

    /*
     * Obtain the encrypted client password
     */
    public GetClientPasswordPayload() {
        super ("GetClientPassword");
    }

    /***
     *
     * @param userID The userid to obtain the password for
     */
    public GetClientPasswordPayload withUserid(int userID) {
        append("userid", userID);

        return this;
    }

    /***
     *
     * @param email The email address to obtain the password for
     */
    public GetClientPasswordPayload withEmail(String email) {
        append("email", email);

        return this;
    }
}