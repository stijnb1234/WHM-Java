package me.hwiggy.whmjava.payload.client;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/deleteclient/
 */
public class DeleteClientPayload extends Payload {

    /***
     *
     * @param clientID The ID of the client to be deleted
     */
    public DeleteClientPayload(int clientID) {
        super("DeleteClient");
        append("clientid", clientID);
    }
}
