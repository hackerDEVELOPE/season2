package collections.HW;

import java.util.*;

public class Phonebook {

    static Map<String, List<String>> map = new HashMap<>();
    public static void add(String lastname, String number){
        if (map.containsKey(lastname)){
            map.get(lastname).add(number);
        }else{
            map.put(lastname, new ArrayList<>(Arrays.asList(number)));
        }

    }
    public static void get(String lastname){
        System.out.println(map.get(lastname));

    }
}
