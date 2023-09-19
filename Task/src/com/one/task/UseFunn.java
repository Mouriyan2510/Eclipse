package com.one.task;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class UseFunn {
    public static void main(String[] args) {
        MapProcessor mapProcessor = map -> {
            // Your implementation logic here
            return map.get("someKey"); // For example, return a value from the map
        };

        Map<Object, Object> myMap = new HashMap<>();
        myMap.put("someKey", "someValue");
        myMap.put("Mouri", "yan");
        Object result = mapProcessor.process(myMap);
        System.out.println(result); // Output: someValue
    }
}
