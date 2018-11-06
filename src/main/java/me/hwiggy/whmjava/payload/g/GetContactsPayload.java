/**
 * Generated by ramidzkh's awesome generator thingy
 */
package me.hwiggy.whmjava.payload.g;

import me.hwiggy.whmjava.payload.Payload;

/**
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/getcontacts/
 */
public class GetContactsPayload extends Payload {

    /*
     * Obtain the Client Contacts that match passed criteria
     */
    public GetContactsPayload() {
        super ("GetContacts");
    }

    /***
     *
     * @param limitStart The offset for the returned log data (default: 0)
     */
    public GetContactsPayload withLimitStart(int limitStart) {
        append("limitstart", limitStart);

        return this;
    }

    /***
     *
     * @param limitNum The number of records to return (default: 25)
     */
    public GetContactsPayload withLimitNum(int limitNum) {
        append("limitnum", limitNum);

        return this;
    }

    /***
     *
     * @param userID Find contacts for a specific client id
     */
    public GetContactsPayload withUserID(int userID) {
        append("userid", userID);

        return this;
    }

    /***
     *
     * @param firstname Find contacts with a specific first name
     */
    public GetContactsPayload withFirstName(String firstname) {
        append("firstname", firstname);

        return this;
    }

    /***
     *
     * @param lastName Find contacts with a specific last name
     */
    public GetContactsPayload withLastName(String lastName) {
        append("lastname", lastName);

        return this;
    }

    /***
     *
     * @param companyName Find contacts with a specific company name
     */
    public GetContactsPayload withCompanyName(String companyName) {
        append("companyname", companyName);

        return this;
    }

    /***
     *
     * @param email Find contacts with a specific email address
     */
    public GetContactsPayload withEmail(String email) {
        append("email", email);

        return this;
    }

    /***
     *
     * @param address1 Find contacts with a specific address line 1
     */
    public GetContactsPayload withAddress1(String address1) {
        append("address1", address1);

        return this;
    }

    /***
     *
     * @param address2 Find contacts with a specific address line 2
     */
    public GetContactsPayload withAddress2(String address2) {
        append("address2", address2);

        return this;
    }

    /***
     *
     * @param city Find contacts with a specific city
     */
    public GetContactsPayload withCity(String city) {
        append("city", city);

        return this;
    }

    /***
     *
     * @param state Find contacts with a specific state
     */
    public GetContactsPayload withState(String state) {
        append("state", state);

        return this;
    }

    /***
     *
     * @param postcode Find contacts with a specific post/zip code
     */
    public GetContactsPayload withPostcode(String postcode) {
        append("postcode", postcode);

        return this;
    }

    /***
     *
     * @param country Find contacts with a specific country
     */
    public GetContactsPayload withCountry(String country) {
        append("country", country);

        return this;
    }

    /***
     *
     * @param phoneNumber Find contacts with a specific phone number
     */
    public GetContactsPayload withPhonenumber(String phoneNumber) {
        append("phonenumber", phoneNumber);

        return this;
    }

    /***
     *
     * @param subAccount Search for sub-accounts
     */
    public GetContactsPayload withSubAccount(boolean subAccount) {
        append("subaccount", subAccount);

        return this;
    }
}