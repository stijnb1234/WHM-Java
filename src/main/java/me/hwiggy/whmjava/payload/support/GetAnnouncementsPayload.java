package me.hwiggy.whmjava.payload.support;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getannouncements/
 */
public class GetAnnouncementsPayload extends Payload {
    public GetAnnouncementsPayload() {
        super("GetAnnouncements");
    }

    /***
     *
     * @param limitStart The offset for the returned announcement data (default: 0)
     */
    public GetAnnouncementsPayload withLimitStart(String limitStart) {
        append("limitstart", limitStart);
        return this;
    }

    /***
     *
     * @param limitNum The number of records to return (default: 25)
     */
    public GetAnnouncementsPayload withLimitNum(String limitNum) {
        append("limitnum", limitNum);
        return this;
    }
}
