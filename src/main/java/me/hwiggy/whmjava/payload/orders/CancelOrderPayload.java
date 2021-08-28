package me.hwiggy.whmjava.payload.orders;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/cancelorder/
 */
public class CancelOrderPayload extends Payload {

    /***
     *
     * @param orderID The ID of the pending order
     */
    public CancelOrderPayload(int orderID) {
        super("CancelOrder");
        append("orderid", orderID);
    }

    /***
     *
     * @param cancelSub Attempt to cancel the subscription associated with the products
     * @return This Payload, for chaining
     */
    public CancelOrderPayload withCancelSub(boolean cancelSub){
        append("cancelsub", cancelSub);
        return this;
    }

    /***
     *
     * @param noEmail Set to true to stop the invoice payment email being sent if the invoice becomes paid
     * @return This Payload, for chaining
     */
    public CancelOrderPayload withNoEmail(boolean noEmail){
        append("noemail", noEmail);
        return this;
    }
}
