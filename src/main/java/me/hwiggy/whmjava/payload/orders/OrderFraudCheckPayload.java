package me.hwiggy.whmjava.payload.orders;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/orderfraudcheck/
 */
public class OrderFraudCheckPayload extends Payload {

    /***
     *
     * @param orderID The order id to complete the fraud check on
     */
    public OrderFraudCheckPayload(int orderID) {
        super("OrderFraudCheck");
        append("orderid", orderID);
    }

    /***
     *
     * @param IPAddress To override the IP address on the fraud check
     */
    public OrderFraudCheckPayload withIPAddress(String IPAddress) {
        append("ipaddress", IPAddress);
        return this;
    }
}
