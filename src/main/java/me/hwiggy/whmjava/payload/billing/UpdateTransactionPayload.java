package me.hwiggy.whmjava.payload.billing;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/updatetransaction/
 */
public class UpdateTransactionPayload extends Payload {

    /***
     *
     * @param transactionID The unique id of the transaction to update
     */
    public UpdateTransactionPayload(int transactionID) {
        super("UpdateTransaction");
        append("transactionid", transactionID);
    }

    /***
     *
     * @param refundID The unique id of the transaction that this transaction refunds
     */
    public UpdateTransactionPayload withRefundID(int refundID) {
        append("refundid", refundID);
        return this;
    }

    /***
     *
     * @param userID The ID of the user to apply the transaction to
     */
    public UpdateTransactionPayload withUserID(int userID) {
        append("userid", userID);
        return this;
    }

    /***
     *
     * @param invoiceID The ID of the invoice the transaction is for
     */
    public UpdateTransactionPayload withInvoiceID(int invoiceID) {
        append("invoiceid", invoiceID);
        return this;
    }

    /***
     *
     * @param transID The unique transaction id for this payment
     */
    public UpdateTransactionPayload withTransID(int transID) {
        append("transid", transID);
        return this;
    }

    /***
     *
     * @param date The date of the transaction Y-m-d
     */
    public UpdateTransactionPayload withDate(String date) {
        append("date", date);
        return this;
    }

    /***
     *
     * @param gateway The gateway of the transaction in system format
     */
    public UpdateTransactionPayload withGateway(String gateway) {
        append("gateway", gateway);
        return this;
    }

    /***
     *
     * @param currency The gateway of the transaction in system format
     */
    public UpdateTransactionPayload withCurrency(int currency) {
        append("currency", currency);
        return this;
    }

    /***
     *
     * @param description The description of the transaction
     */
    public UpdateTransactionPayload withDescription(String description) {
        append("description", description);
        return this;
    }

    /***
     *
     * @param amountIn The amount received by the payment
     */
    public UpdateTransactionPayload withAmountIn(float amountIn) {
        append("amountin", amountIn);
        return this;
    }

    /***
     *
     * @param fees The amount of fee charged on the transaction by the merchant - This can be negative
     */
    public UpdateTransactionPayload withFees(float fees) {
        append("fees", fees);
        return this;
    }

    /***
     *
     * @param amountOut The amount paid out by the payment
     */
    public UpdateTransactionPayload withAmountOut(float amountOut) {
        append("amountout", amountOut);
        return this;
    }

    /***
     *
     * @param rate The exchange rate for the payment based on the default currency
     */
    public UpdateTransactionPayload withRate(int rate) {
        append("rate", rate);
        return this;
    }

    /***
     *
     * @param credit Should the payment be applied to credit on the client account. Invoice ID must not be provided.
     */
    public UpdateTransactionPayload withCredit(boolean credit) {
        append("credit", credit);
        return this;
    }
}
