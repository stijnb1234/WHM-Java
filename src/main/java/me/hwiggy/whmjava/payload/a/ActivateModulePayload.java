package me.hwiggy.whmjava.payload.a;

import com.google.gson.JsonObject;
import me.hwiggy.whmjava.payload.Payload;
/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/activatemodule/
 */
public class ActivateModulePayload extends Payload {

    /***
     *
     * @param moduleType The module type to be activated
     * @param moduleName The module name to be activated
     */
    ActivateModulePayload(String moduleType, String moduleName) {
        super("ActivateModule");
        append("moduleType", moduleType);
        append("moduleName", moduleName);
    }

    /***
     *
     * @param parameters An array of configuration parameters to set for the given module. Use GetModuleConfigurationParameters to obtain a list of fields for a given module.
     * @return This Payload, for chaining
     */
    public ActivateModulePayload withParameters(JsonObject parameters){
        append("parameters", parameters);
        return this;
    }
}
