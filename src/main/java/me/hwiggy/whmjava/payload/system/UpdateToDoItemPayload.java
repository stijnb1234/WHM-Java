package me.hwiggy.whmjava.payload.system;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updatetodoitem/
 */
public class UpdateToDoItemPayload extends Payload {


    public UpdateToDoItemPayload() {
        super("UpdateToDoItem");
    }

    /***
     *
     * @param itemID The id of the To-Do item to be updated.
     */
    public UpdateToDoItemPayload withItemID(int itemID) {
        append("itemid", itemID);
        return this;
    }

    /***
     *
     * @param adminID The admin id performing the update.
     */
    public UpdateToDoItemPayload withAdminID(int adminID) {
        append("adminid", adminID);
        return this;
    }

    /***
     *
     * @param status The status of the to-do item.
     */
    public UpdateToDoItemPayload withStatus(String status) {
        append("status", status);
        return this;
    }
}
