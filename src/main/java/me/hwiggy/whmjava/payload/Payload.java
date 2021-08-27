package me.hwiggy.whmjava.payload;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public abstract class Payload {
    private final JsonObject object = new JsonObject();

    public Payload(String action){
        append("action", action);
    }

    //TODO Add Object, instanceof or throw error.

    public Payload append(String path, Object toAppend) {
        if (toAppend == null) throw new IllegalArgumentException("At path " + path + ", given object is null.");

        if (toAppend instanceof String) {
            append(path, (String) toAppend);
        } else if (toAppend instanceof Number) {
            append(path, (Number) toAppend);
        } else if (toAppend instanceof Boolean) {
            append(path, (Boolean) toAppend);
        } else if (toAppend instanceof JsonObject) {
            append(path, (JsonObject) toAppend);
        } else if (toAppend instanceof String[]) {
            JsonArray jsonArray = new JsonArray();
            for (String i : (String[]) toAppend) {
                jsonArray.add(i);
            }
            append(path, jsonArray);
        } else if (toAppend instanceof Number[]) {
            JsonArray jsonArray = new JsonArray();
            for (Number i : (Number[]) toAppend) {
                jsonArray.add(i);
            }
            append(path, jsonArray);
        } else if (toAppend instanceof Boolean[]) {
            JsonArray jsonArray = new JsonArray();
            for (Boolean i : (Boolean[]) toAppend) {
                jsonArray.add(i);
            }
            append(path, jsonArray);
        } else {
            throw new IllegalArgumentException("Unsupported data type " + toAppend.getClass().getName() + " for path " + path + ".");
        }
        return this;
    }

    public Payload append(String path, String toAppend) {
        object.addProperty(path, toAppend);
        return this;
    }

    public Payload append(String path, Number toAppend) {
        object.addProperty(path, toAppend);
        return this;
    }

    public Payload append(String path, Boolean toAppend) {
        object.addProperty(path, toAppend);
        return this;
    }

    public Payload append(String path, JsonElement toAppend) {
        object.add(path, toAppend);
        return this;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
