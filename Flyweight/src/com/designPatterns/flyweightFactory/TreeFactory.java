package com.designPatterns.flyweightFactory;

import com.designPatterns.flyweightClass.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color,int val) {
        String key = name + "-" + color;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, val));
            System.out.println("Creating new TreeType: " + key);
        }
        return treeTypes.get(key);
    }
}
