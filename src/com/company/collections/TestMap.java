package com.company.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) {
        //  <Integer, String>  - тип знаяения ключа и значения
        HashMap<Integer, String> new_map = new HashMap<>();
        //   заполняем мапу, через метод "put"
        new_map.put(1, "one");
        new_map.put(2, "two");
        new_map.put(3, "three");
        new_map.put(4, "fore");
        System.out.println("Map: " + new_map);

        // containsKey, get, getOrDefault method
        System.out.println("Map has key: " + new_map.containsKey(1));
        System.out.println("Map has value: " + new_map.containsValue("one"));
        System.out.println("Value: " + new_map.get(4));
        System.out.println("Value: " + new_map.getOrDefault(8, "sorry, no value found"));

        Set<Integer> keys = new_map.keySet();
        System.out.println("Keys: " + keys);
        Collection<String> values = new_map.values();
        System.out.println("Values: " + values);

        //   итерируемся по мапе
        for (Integer key: new_map.keySet()) {
            System.out.println("value of map: " + new_map.get(key));
        }

        String removed = new_map.remove(4);
        System.out.println(new_map);
        System.out.println("was removed: " + removed);

    }
}
