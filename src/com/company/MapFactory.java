package com.company;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory {

    public Map<String, String> makeMap (String type) {
        if (type.equals("HashMap")) {
            return new HashMap<>();
        } else if (type.equals("LinkedHashMap")) {
            return new LinkedHashMap<>();
        } else if (type.equals("TreeMap")) {
            return new TreeMap<>();
        } else
            return new HashMap<>();
    }
}
