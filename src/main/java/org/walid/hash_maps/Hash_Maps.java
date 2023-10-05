package org.walid.hash_maps;

import java.util.HashMap;
import java.util.Map;

public class Hash_Maps {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // put method
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // containsKey method
        System.out.println("Contains Key 'Two': " + map.containsKey("Two"));

        // containsValue method
        System.out.println("Contains Value 3: " + map.containsValue(3));

        // entrySet method
        System.out.println("Map Entry Set: " + map.entrySet());

        // equals method
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("One", 1);
        map2.put("Two", 2);
        map2.put("Three", 3);
        System.out.println("Map Equals: " + map.equals(map2));

        // get method
        System.out.println("Value for Key 'Two': " + map.get("Two"));

        // hashCode method
        System.out.println("Map Hash Code: " + map.hashCode());

        // isEmpty method
        System.out.println("Is Map Empty: " + map.isEmpty());

        // keySet method
        System.out.println("Map Key Set: " + map.keySet());

        // putAll method
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Four", 4);
        map3.put("Five", 5);
        map.putAll(map3);
        System.out.println("Map After putAll: " + map);

        // remove method
        map.remove("Three");
        System.out.println("Map After Remove: " + map);

        // size method
        System.out.println("Map Size: " + map.size());

        // values method
        System.out.println("Map Values: " + map.values());

        // getOrDefault method
        System.out.println("Value for Key 'Six': " + map.getOrDefault("Six", 6));

        // merge method
        map.merge("Five", 10, Integer::sum);
        System.out.println("Map After Merge: " + map);

        // putIfAbsent method
        map.putIfAbsent("Six", 6);
        System.out.println("Map After putIfAbsent: " + map);
    }
}
