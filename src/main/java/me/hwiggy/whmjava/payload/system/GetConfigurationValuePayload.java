/**
 * Generated by ramidzkh's awesome generator thingy
 */
package me.hwiggy.whmjava.payload.system;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getconfigurationvalue/
 */
public class GetConfigurationValuePayload extends Payload {

    /***
     * Retrieve a System Configuration Value.
     * @param setting The name of the setting to be obtained
     */
    public GetConfigurationValuePayload(String setting) {
        super ("GetConfigurationValue");
        append("setting", setting);
    }
}