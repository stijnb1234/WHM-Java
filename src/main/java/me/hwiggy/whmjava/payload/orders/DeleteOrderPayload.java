package me.hwiggy.whmjava.payload.orders;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/deleteorder/
 */
public class DeleteOrderPayload extends Payload {

    /***
     *
     * @param orderID The ID of the order to be deleted
     */
    public DeleteOrderPayload(int orderID) {
        super("DeleteOrder");
        append("orderid", orderID);
    }
}
