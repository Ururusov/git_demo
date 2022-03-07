package by.vania.questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapTest = new HashMap<>();
        mapTest.put("нет войне", 16);
        mapTest.put("войне", 187);
        mapTest.put("нет", 387);
        mapTest.put("войне нет!", null);
        mapTest.put("война иди на хуй!", 2);

        System.out.println(mapTest.get("нет"));
        System.out.println(mapTest.keySet());
        System.out.println(mapTest.getOrDefault("войне нет", 0));
        System.out.println(mapTest.values());
        System.out.println(mapTest.entrySet());
        System.out.println(mapTest.isEmpty());
        System.out.println(mapTest.putIfAbsent("войне нет!", 4));
        System.out.println(mapTest.put("а что ты", 33));



        for (Map.Entry<String, Integer> entryTest : mapTest.entrySet()){
            if (entryTest.getValue().equals(387)){
                System.out.println(entryTest.hashCode());
            }
            System.out.println(entryTest.getValue() + ": " + entryTest.getKey());

        }

        mapTest.entrySet().removeIf(entry ->
                entry.getValue().equals(187)||
                        entry.getValue().equals(7));
        System.out.println(mapTest.entrySet());

        Iterator<Map.Entry<String, Integer>> iterator = mapTest.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entryI = iterator.next();
            if (entryI.getValue() % 2 == 0){
                entryI.setValue(entryI.getValue()*3);
                if (entryI.getValue() > 40){
                    iterator.remove();
                }
            }
        }



        System.out.println(mapTest.entrySet());

        Map<String, String> mapString = new HashMap<>();
        mapString.put("все", "all 23");
        mapString.put("все идут", " all ");
        mapString.put("корабль нахуй", "  all  ");
        mapString.put("война нет", "  all   24  ");

        System.out.println(mapString.entrySet());

        mapString.replaceAll((key, value) -> value.trim());

        System.out.println(mapString.entrySet());


    }
}
