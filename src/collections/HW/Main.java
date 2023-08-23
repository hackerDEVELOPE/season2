package collections.HW;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"чипап","чипап","чипап","чипап","чипап","чипап","бебра","бебра","бебра","бебра","бебра"};
        Map<String, Integer> map = new HashMap<>();
        for (String string : arr) {
            int count = map.getOrDefault(string, 0);
            map.put(string, count +1);
        }
//        System.out.println(map);


        Phonebook.add("Джуктор", "922910000");
        Phonebook.add("Джуктор", "9229100322");
        Phonebook.add("Джуктор", "92291008989");
        Phonebook.add("VanyaMVD", "911111111MVD");
        Phonebook.add("MaksCoding", "42424242424242");
        Phonebook.add("ViktorSVO", "930IPHONE14PROMAX");
        Phonebook.add("DanyaIP", "920BILAIN");

        Phonebook.get("Джуктор");
        Phonebook.get("VanyaMVD");
        Phonebook.get("MaksCoding");
        Phonebook.get("ViktorSVO");
        Phonebook.get("DanyaIP");

    }
}
