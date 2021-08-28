package me.hwiggy.whmjava.payload.products;

import com.google.gson.JsonObject;
import me.hwiggy.whmjava.payload.Payload;

/***
 * This class and its methods directly relate to the API documentation.
 * API documentation can be found at the following URL:
 * https://developers.whmcs.com/api-reference/addproduct/
 */
public class AddProductPayload extends Payload {

    /***
     *
     * @param name The name of the product to be added
     * @param gID The ID of the product group to add the product
     */
    public AddProductPayload(String name, int gID) {
        super("AddProduct");
        append("name", name);
        append("gid", gID);
    }

    /***
     *
     * @param type One of ‘hostingaccount’, ‘reselleraccount’, ‘server’ or ‘other’
     * @return This Payload, for chaining
     */
    public AddProductPayload withType(String type){
        append("type", type);
        return this;
    }

    /***
     *
     * @param stockControl Set to true to enable stock control on the product
     * @return This Payload, for chaining
     */
    public AddProductPayload witStockControl(boolean stockControl){
        append("stockcontrol", stockControl);
        return this;
    }

    /***
     *
     * @param qty How much of this product is in stock
     * @return This Payload, for chaining
     */
    public AddProductPayload withQty(int qty){
        append("qty", qty);
        return this;
    }

    /***
     *
     * @param payType The payment type of the product. One of ‘free’, ‘onetime’, ‘recurring’
     * @return This Payload, for chaining
     */
    public AddProductPayload withPayType(String payType){
        append("paytype", payType);
        return this;
    }

    /***
     *
     * @param hidden Should the product be hidden from the client order form
     * @return This Payload, for chaining
     */
    public AddProductPayload withHidden(boolean hidden){
        append("hidden", hidden);
        return this;
    }

    /***
     *
     * @param showDomainOptions Should the product show the domain registration options
     * @return This Payload, for chaining
     */
    public AddProductPayload withShowDomainOptions(boolean showDomainOptions){
        append("showdomainoptions", showDomainOptions);
        return this;
    }

    /***
     *
     * @param tax Does tax apply to the product.
     * @return This Payload, for chaining
     */
    public AddProductPayload withTax(boolean tax){
        append("tax", tax);
        return this;
    }

    /***
     *
     * @param isFeatured Should the product be featured in the Product Group.
     * @return This Payload, for chaining
     */
    public AddProductPayload withIsFeatured(boolean isFeatured){
        append("isFeatured", isFeatured);
        return this;
    }

    /***
     *
     * @param prorataBilling Is pro-rata billing enabled for this product.
     * @return This Payload, for chaining
     */
    public AddProductPayload withProrataBilling(boolean prorataBilling){
        append("proratabilling", prorataBilling);
        return this;
    }

    /***
     *
     * @param description The description of the product to show on the product listing in the cart
     * @return This Payload, for chaining
     */
    public AddProductPayload withDescription(String description){
        append("description", description);
        return this;
    }

    /***
     *
     * @param welcomeEmail The id of the Email Template to use as the welcome email. Product/Service Messages only
     * @return This Payload, for chaining
     */
    public AddProductPayload withWelcomeEmail(int welcomeEmail){
        append("welcomeemail", welcomeEmail);
        return this;
    }

    /***
     *
     * @param prorataDate See http://docs.whmcs.com/Products_and_Services#Pricing_Tab
     * @return This Payload, for chaining
     */
    public AddProductPayload withProrataDate(int prorataDate){
        append("proratadate", prorataDate);
        return this;
    }

    /***
     *
     * @param prorataChargeNextMonth See http://docs.whmcs.com/Products_and_Services#Pricing_Tab
     * @return This Payload, for chaining
     */
    public AddProductPayload withProrataChargeNextMonth(int prorataChargeNextMonth){
        append("proratachargenextmonth", prorataChargeNextMonth);
        return this;
    }

    /***
     *
     * @param subdomain A comma separated list of subdomains to offer on the domain register page. eg: .domain1.com,.domain2.com
     * @return This Payload, for chaining
     */
    public AddProductPayload withSubdomain(String subdomain){
        append("subdomain", subdomain);
        return this;
    }

    /***
     *
     * @param autoSetup When should the product be automatically setup. One of “ (never), ‘on’ (pending order), ‘payment’ (on payment), ‘order’ (on order)
     * @return This Payload, for chaining
     */
    public AddProductPayload withAutoSetup(String autoSetup){
        append("autosetup", autoSetup);
        return this;
    }

    /***
     *
     * @param module The server module system name to associate with the product. eg: cpanel, autorelease, plesk
     * @return This Payload, for chaining
     */
    public AddProductPayload withModule(String module){
        append("module", module);
        return this;
    }

    /***
     *
     * @param serverGroupID The server group id used on product creation to associate an appropriate server
     * @return This Payload, for chaining
     */
    public AddProductPayload withServerGroupID(int serverGroupID){
        append("servergroupid", serverGroupID);
        return this;
    }

    /***
     *
     * @param configOptionOne The first module configuration value
     * @return This Payload, for chaining
     */
    public AddProductPayload withConfigOptionOne(Object configOptionOne){
        append("configoption1", configOptionOne);
        return this;
    }

    /***
     *
     * @param configOptionTwo The second module configuration value
     * @return This Payload, for chaining
     */
    public AddProductPayload withConfigOptionTwo(Object configOptionTwo){
        append("configoption2", configOptionTwo);
        return this;
    }

    /***
     *
     * @param configOptionThree The third module configuration value
     * @return This Payload, for chaining
     */
    public AddProductPayload withConfigOptionThree(Object configOptionThree){
        append("configoption3", configOptionThree);
        return this;
    }

    /***
     *
     * @param configOptionFour The fourth module configuration value
     * @return This Payload, for chaining
     */
    public AddProductPayload withConfigOptionFour(Object configOptionFour){
        append("configoption4", configOptionFour);
        return this;
    }

    /***
     *
     * @param configOptionFive The fifth module configuration value
     * @return This Payload, for chaining
     */
    public AddProductPayload withConfigOptionFive(Object configOptionFive){
        append("configoption5", configOptionFive);
        return this;
    }

    /***
     *
     * @param configOptionSix The sixth module configuration value
     * @return This Payload, for chaining
     */
    public AddProductPayload withConfigOptionSix(Object configOptionSix){
        append("configoption6", configOptionSix);
        return this;
    }

    /***
     *
     * @param order The order to in which to display on the order form
     * @return This Payload, for chaining
     */
    public AddProductPayload withOrder(int order){
        append("order", order);
        return this;
    }

    /***
     *
     * @param pricing K-V array, where K is the currency ID and V is an array of K-V values where K is the billing cycle, and V is the amount to bill.
     * @return This Payload, for chaining
     */
    public AddProductPayload withPricing(JsonObject pricing){
        append("pricing", pricing);
        return this;
    }
}
