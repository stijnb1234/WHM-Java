package me.hwiggy.whmjava.payload.domains;

import me.hwiggy.whmjava.payload.Payload;

public class GetTLDPricingPayload extends Payload {
    public GetTLDPricingPayload() {
        super("GetTLDPricing");
    }

    /***
     *
     * @param currencyID The currency ID to fetch pricing for
     */
    public GetTLDPricingPayload withCurrencyID(int currencyID) {
        append("currencyid", currencyID);
        return this;
    }

    /***
     *
     * @param clientID The id of the client to fetch pricing for. Pass one or the other. clientid being passed will override currencyid
     */
    public GetTLDPricingPayload withClientID(int clientID) {
        append("clientid", clientID);
        return this;
    }
}
