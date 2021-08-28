package me.hwiggy.whmjava.payload.billing;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/capturepayment/
 */
public class CapturePaymentPayload extends Payload {

    /***
     *
     * @param invoiceID The ID of the pending order
     */
    public CapturePaymentPayload(int invoiceID) {
        super("CapturePayment");
        append("invoiceid", invoiceID);
    }

    /***
     *
     * @param CVV The CVV Number for the card being attempted
     * @return This Payload, for chaining
     */
    public CapturePaymentPayload withCVV(String CVV){
        append("cvv", CVV);
        return this;
    }
}
