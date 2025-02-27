/**
 * Generated by ramidzkh's awesome generator thingy
 */
package me.hwiggy.whmjava.payload.domains;

        import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/domainupdatewhoisinfo/
 */
public class DomainUpdateWhoisInfoPayload extends Payload {

    /***
     * Sends the Save Whois command to the registrar for the domain
     * @param domainID The id of the domain to update the whois information for
     * @param xml The xml of the details to update. See DomainGetWhoisInfo
     */
    public DomainUpdateWhoisInfoPayload(int domainID, String xml) {
        super ("DomainUpdateWhoisInfo");
        append("domainid", domainID);
        append("xml", xml);
    }
}
