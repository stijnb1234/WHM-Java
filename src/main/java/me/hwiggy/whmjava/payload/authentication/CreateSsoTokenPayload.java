package me.hwiggy.whmjava.payload.authentication;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/createssotoken/
 */
public class CreateSsoTokenPayload extends Payload {
    public CreateSsoTokenPayload() {
        super("CreateSsoToken");
    }

    /**
     *
     * @param clientID The id of the client that should be authenticated by the resulting token
     * @return This Payload, for chaining
     */
    public CreateSsoTokenPayload withClientId(int clientID) {
        append("client_id", clientID);
        return this;
    }

    /**
     *
     * @param userID The id of the user that should be authenticated by the resulting token. If not provided, the owner of the requested client will be assumed.
     * @return This Payload, for chaining
     */
    public CreateSsoTokenPayload withUserId(int userID) {
        append("user_id", userID);
        return this;
    }

    /**
     *
     * @param destination A single valid destination. If not provided, the destination will be the clientarea homepage
     * @return This Payload, for chaining
     */
    public CreateSsoTokenPayload withDestination(String destination) {
        append("destination", destination);
        return this;
    }

    /**
     *
     * @param serviceID The id of the service for respective clientarea $destination
     * @return This Payload, for chaining
     */
    public CreateSsoTokenPayload withServiceId(int serviceID) {
        append("service_id", serviceID);
        return this;
    }

    /**
     *
     * @param domainID The id of the domain for respective clientarea $destination
     * @return This Payload, for chaining
     */
    public CreateSsoTokenPayload withDomainId(int domainID) {
        append("domain_id", domainID);
        return this;
    }

    /**
     *
     * @param ssoRedirectPath Custom relative path for redirection after authentication when using sso:custom_redirect destination
     * @return This Payload, for chaining
     */
    public CreateSsoTokenPayload withSSORedirectPath(String ssoRedirectPath) {
        append("sso_redirect_path", ssoRedirectPath);
        return this;
    }
}
