/**
 * Generated by ramidzkh's awesome generator thingy
 */
package me.hwiggy.whmjava.payload.projectmanagement;

import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the￼ following URL:
 ￼* https://developers.whmcs.com/api-reference/deleteprojecttask/
 */
public class DeleteProjectTaskPayload extends Payload {

    /***
     * Deletes a task associated with a project
     * @param projectID The project that owns the task being deleted
     * @param taskID The task to be deleted
     */
    public DeleteProjectTaskPayload(int projectID, int taskID) {
        super ("DeleteProjectTask");
        append("projectid", projectID);
        append("taskid", taskID);
    }
}
