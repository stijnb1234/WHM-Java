package me.hwiggy.whmjava.payload.system;

import me.hwiggy.whmjava.payload.Payload;
/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/logactivaty/
 */
public class LogActivityPayload extends Payload {
    /***
     *
     * @param description Creates an activity log entry.
     */
    public LogActivityPayload(String description) {
        super ("LogActivity");
        append("description", description);
    }

    /***
     *
     * @param userid The id to log.
     */
    public LogActivityPayload withUserid(int userid) {
        append("userid", userid);
        return this;
    }
}
