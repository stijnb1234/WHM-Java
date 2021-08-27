package me.hwiggy.whmjava.payload.s;

import com.google.gson.JsonObject;
import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/sendadminemail/
 */
public class SendAdminEmailPayload extends Payload {
    public SendAdminEmailPayload() {
        super("SendAdminEmail");
    }

    /***
     * @param messageName    The name of the admin email template to send	
     */
    public SendAdminEmailPayload withMessageName(String messageName) {
        append("messagename", messageName);
        return this;
    }

    /***
     * @param customMessage    The HTML message body to send for a custom email	
     */
    public SendAdminEmailPayload withCustomMessage(String customMessage) {
        append("custommessage", customMessage);
        return this;
    }

    /***
     * @param customSubject    The subject to send for a custom email	
     */
    public SendAdminEmailPayload withCustomSubject(String customSubject) {
        append("customsubject", customSubject);
        return this;
    }

    /***
     * @param type    Which type of admin notification will be send (‘system’, ‘account’, ‘support’)	
     */
    public SendAdminEmailPayload withType(String type) {
        append("type", type);
        return this;
    }

    /***
     * @param deptID    The ID of the department the notification is for if ‘support’ $type	
     */
    public SendAdminEmailPayload withDeptID(int deptID) {
        append("deptid", deptID);
        return this;
    }

    /***
     * @param mergeFields    The merge fields to be used in the email template	
     */
    public SendAdminEmailPayload withMergeFields(JsonObject mergeFields) {
        append("mergefields", mergeFields);
        return this;
    }
}
