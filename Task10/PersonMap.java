package Task10;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String args[]){
        HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap
        map.put("Turchyn","Orest");  //Put elements in Map
        map.put("Grey","Orest");
        map.put("Klein","Olena");
        map.put("Big","Olesya");
        map.put("Small","Nataly");  //Put elements in Map
        map.put("Grand","Sasha");
        map.put("Petrov","Anna");
        map.put("Ivanov","Oksana");
        map.put("Good","Petro");
        map.put("Nice","Oleg");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.values().removeIf(value -> value.equals("Orest"));
        System.out.println("Iterating Hashmap after deleting Orest...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
