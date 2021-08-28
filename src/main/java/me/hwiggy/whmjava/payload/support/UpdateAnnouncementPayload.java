package me.hwiggy.whmjava.payload.support;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateannouncement/
 */
public class UpdateAnnouncementPayload extends Payload {

    /***
     *
     * @param announcementID The id of the announcement to update
     */
    public UpdateAnnouncementPayload(int announcementID) {
        super("UpdateAnnouncement");
        append("announcementID", announcementID);
    }

    /***
     * @param title
     */
    public UpdateAnnouncementPayload withTitle(String title) {
        append("title", title);
        return this;
    }

    /***
     * @param announcement
     */
    public UpdateAnnouncementPayload withAnnouncement(String announcement) {
        append("announcement", announcement);
        return this;
    }

    /***
     * @param date
     */
    public UpdateAnnouncementPayload withDate(String date) {
        append("date", date);
        return this;
    }

    /***
     * @param published
     */
    public UpdateAnnouncementPayload withPublished(boolean published) {
        append("published", published);
        return this;
    }
}
