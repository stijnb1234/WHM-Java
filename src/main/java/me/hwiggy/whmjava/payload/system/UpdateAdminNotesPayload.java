package me.hwiggy.whmjava.payload.system;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updateadminnotes/
 */
public class UpdateAdminNotesPayload extends Payload {

    /***
     *
     * @param notes The new value for the admin notes
     */
    public UpdateAdminNotesPayload(String notes) {
        super("UpdateAdminNotes");
        append("notes", notes);
    }
}
