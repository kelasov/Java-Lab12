package Pr23.Ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Александр");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Сергей");
        map.put("Антонов", "Александр");
        map.put("Крюков", "Андрей");
        map.put("Павлов", "Семен");

        Map<String, String> nmap = new HashMap<>();
        for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            String value = map.get(key);
            if (!nmap.containsValue(value))
                nmap.put(key, value);
        }
        System.out.println(nmap);
    }
}
