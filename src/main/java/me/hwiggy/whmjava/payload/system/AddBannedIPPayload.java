package me.hwiggy.whmjava.payload.system;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addbannedip/
 */
public class AddBannedIPPayload extends Payload {

    /***
     *
     * @param ip The IP Address to ban
     * @param reason Admin only reason
     * @param days If passed, expires date is auto calculated
     */
    AddBannedIPPayload(String ip, String reason, int days) {
        super("AddBannedIp");
        append("ip", ip);
        append("reason", reason);
        append("days", days);
    }
}
