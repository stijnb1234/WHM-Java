package me.hwiggy.whmjava.payload.billing;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addinvoicepayment/
 */
public class AddInvoicePaymentPayload extends Payload {

    /***
     *
     * @param invoiceID The invoice to add payment for
     * @param transID The unique transaction id that should be applied to the payment
     * @param gateway The gateway used, in system name format, eg. paypal, authorize
     */
    public AddInvoicePaymentPayload(int invoiceID, String transID, String gateway) {
        super("AddInvoice");
    }

    /***
     *
     * @param date The date that the payment should have assigned. Format: YYYY-MM-DD HH:mm:ss
     * @return This Payload, for chaining
     */
    public AddInvoicePaymentPayload withDate(String date){
        append("date", date);
        return this;
    }

    /***
     *
     * @param amount The amount paid, can be left undefined to take full amount of invoice
     * @return This Payload, for chaining
     */
    public AddInvoicePaymentPayload withAmount(float amount){
        append("amount", amount);
        return this;
    }

    /***
     *
     * @param fees The amount of the payment that was taken as a fee by the gateway
     * @return This Payload, for chaining
     */
    public AddInvoicePaymentPayload withFees(float fees){
        append("fees", fees);
        return this;
    }

    /***
     *
     * @param noEmail Set to true to not send an email for the invoice payment
     * @return This Payload, for chaining
     */
    public AddInvoicePaymentPayload withNoEmail(boolean noEmail){
        append("noemail", noEmail);
        return this;
    }
}
