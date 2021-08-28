package me.hwiggy.whmjava.payload.tickets;

import com.google.gson.JsonObject;
import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addticketnote/
 */
public class AddTicketNotePayload extends Payload {

    /***
     *
     * @param message The content of the ticket note
     * @param ticketNum The Client Ticket Number ID to apply the note to
     */
    public AddTicketNotePayload(String message, String ticketNum) {
        super("AddTicketNote");
        append("message", message);
        append("ticketnum", ticketNum);
    }

    /***
     *
     * @param message The content of the ticket note
     * @param ticketID The id of the ticket in the database.
     */
    public AddTicketNotePayload(String message, int ticketID){
        super("AddTicketNote");
        append("message", message);
        append("ticketid", ticketID);
    }

    /***
     *
     * @param markdown Should markdown be used on the ticket note output
     * @return This Payload, for chaining
     */
    public AddTicketNotePayload withMarkdown(boolean markdown){
        append("markdown", markdown);
        return this;
    }

    /***
     *
     * @param attachments Optional base64 json encoded array of file attachments. Can be the direct output of a multipart-form-data form submission ($_FILES superglobal in PHP) or an array of arrays consisting of both a filename and data keys
     * @return This Payload, for chaining
     */
    public AddTicketNotePayload withAttachments(JsonObject attachments){
        append("attachments", attachments);
        return this;
    }
}
