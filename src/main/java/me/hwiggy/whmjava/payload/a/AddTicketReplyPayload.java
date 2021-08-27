package me.hwiggy.whmjava.payload.a;

import com.google.gson.JsonObject;
import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addticketreply/
 */
public class AddTicketReplyPayload extends Payload {

    /***
     *
     * @param ticketID The id of the ticket in the database.
     * @param message The content of the ticket reply
     */
    public AddTicketReplyPayload(int ticketID, String message) {
        super("AddTicketReply");
        append("ticketid", ticketID);
        append("message", message);
    }

    /***
     *
     * @param markdown Should markdown be used on the ticket reply output
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withMarkdown(boolean markdown) {
        append("markdown", markdown);
        return this;
    }

    /***
     *
     * @param userID Pass a userid to associate the ticket reply with a specific client
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withUserID(int userID) {
        append("userid", userID);
        return this;
    }

    /***
     *
     * @param contactID Pass a contactid to associate the ticket reply with a specific contact belonging to $userid
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withContactID(int contactID) {
        append("contactid", contactID);
        return this;
    }

    /***
     *
     * @param adminUsername The admin username to associate the ticket reply with
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withAdminUsername(String adminUsername) {
        append("adminusername", adminUsername);
        return this;
    }

    /***
     *
     * @param name The name to associate with the ticket reply if not an admin or client response
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withName(String name) {
        append("name", name);
        return this;
    }

    /***
     *
     * @param email The email to associate with the ticket reply if not an admin or client response
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withEmail(String email) {
        append("email", email);
        return this;
    }

    /***
     *
     * @param status The status to set on the ticket after the reply is made if the default status on admin/client response is not required. See GetSupportStatuses API command
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withStatus(String status) {
        append("status", status);
        return this;
    }

    /***
     *
     * @param noEmail Set to true to stop the ticket reply email being sent
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withNoEmail(boolean noEmail) {
        append("noemail", noEmail);
        return this;
    }

    /***
     *
     * @param customFields A base64 encoded array of the custom fields to update
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withCustomFields(String customFields) {
        append("customfields", customFields);
        return this;
    }

    /***
     *
     * @param attachments Optional base64 json encoded array of file attachments. Can be the direct output of a multipart-form-data form submission ($_FILES superglobal in PHP) or an array of arrays consisting of both a filename and data keys
     * @return This Payload, for chaining
     */
    public AddTicketReplyPayload withAttachments(JsonObject attachments) {
        append("attachments", attachments);
        return this;
    }
}
