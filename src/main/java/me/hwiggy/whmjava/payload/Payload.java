package me.hwiggy.whmjava.payload;


import java.util.HashMap;
import java.util.Map;

public abstract class Payload {
    private final Map<String, Object> data = new HashMap<>();

    public Payload(String action){
        append("action", action);
    }

    public Payload append(String path, Object toAppend) {
        data.put(path, toAppend);

        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
