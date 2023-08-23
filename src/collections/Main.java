package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = new LinkedList<>();
//        list.add(6);

//        list.add(3);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//
//        list.add(1, 88);
//        list.addAll(3, Arrays.asList(4, 5, 1, 128));
//        System.out.println(list);

//        list.remove((Integer) 2);
//        System.out.println(list);

//        list.removeIf(x -> x > 2 && x < 10);
//        list.removeAll(Arrays.asList(2,4,88));
//        System.out.println(list.get(1));
//        list.set(4, 333);
//        list.retainAll(Arrays.asList(2,4,88));
//        list.replaceAll(integer -> integer % 2 == 0 ? integer + 10 : integer);
//        System.out.println(list.indexOf(2));
//        System.out.println(list.lastIndexOf(2));
//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.comparingInt(x -> x%2));
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next()+" ");
//        }
//        for (Integer x : list) {
//            System.out.println(x+ " ");
//        }

//        ListIterator<Integer> listIterator = list.listIterator(4);
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//        ((ArrayList<Integer>)list).ensureCapacity(1000);
//        System.out.println(list);


//        List<Integer> linkedListList = new LinkedList<>();
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(2);
//        queue.add(3);
//        queue.add(5);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(queue.remove());
//        }
//        Deque<Integer> deque = new ArrayDeque<>() {
//        };
//        deque.push(1);
//        deque.push(2);
//        deque.push(3);
//        deque.push(4);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(deque.pop());
//
//        }

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
//        set.add(11111111);
//        set.add(212121212);
//        set.add(343434343);
//        set.add(343434343);
//        Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
//        Set<Integer> setB = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
//        System.out.println(setA);
//        System.out.println(setB);

//        setA.retainAll(setB);
//        System.out.println(setA);

//        setA.addAll(setB);
//        System.out.println(setA);

//        setA.removeAll(setB);
//        System.out.println(setA);
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("Barsik", 3);
//        map.put("Chipap", 6);
//        map.put("Papech", 1);

//        System.out.println(map);
//        System.out.println(map.get("Chipap"));
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }

//        map.forEach((k,v) ->{
//            System.out.println(k+ " "+v);
//        });

//        System.out.println(map.get("Chipap"));
//        System.out.println(map.get("Chipp"));
//        System.out.println(map.getOrDefault("Chipp", 0));

//        Random random = new Random();
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < 100; i++) {
//            int val = random.nextInt(10);
//            Integer num = map.getOrDefault(val, 0);
//            map.put(val, num + 1);
//        }
//        System.out.println(map);

        Map<String, List<String>> map = new HashMap<>();
        map.put("Apple", new ArrayList<>(Arrays.asList("qwe", "asd")));
        List<String> val = map.get("Apple");

    }

}
