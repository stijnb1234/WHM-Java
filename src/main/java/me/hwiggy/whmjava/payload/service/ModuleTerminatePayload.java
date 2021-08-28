package me.hwiggy.whmjava.payload.service;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/moduleterminate/
 */
public class ModuleTerminatePayload extends Payload {

    /***
     *
     * @param accountID The service ID to run the action for
     */
    public ModuleTerminatePayload(int accountID) {
        super("ModuleTerminate");
        append("accountid", accountID);
    }
}
