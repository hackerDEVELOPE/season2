package coding;

import java.util.Arrays;

public class taskwasperfect {
    public static void main(String[] args) {
//        System.out.println(getCount("werklfnweuiguwegwesdf"));
//        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, null, null})));}

/*    public static String doubleChar(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            s1.append(s.charAt(i)).append(s.charAt(i));
        }
        return s1.toString();
    }

    public static Object[] removeEveryOther(Object[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) count++;
        }
        if (arr.length - count == 1 || arr.length - count == 2) return arr;
        int russia = arr.length % 2 == 0 ? arr.length / 2 - count : arr.length / 2 + 1 - count;

        if (arr.length == 2 || arr.length == 1) return arr;
        Object[] arr1 = new Object[russia];
        for (int i = 0, k = 0; k < arr1.length; i = i + 2, k++) {
            if (arr[i] == null) continue;
            arr1[k] = arr[i];
        }
        return arr1;


 */
        System.out.println(highAndLow("1 2 3 4 55 -44"));
    }
    public static int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                count++;
            }
        }


        return count;

    }

    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) > max) max = Integer.parseInt(arr[i]);
            if (Integer.parseInt(arr[i]) < min) min = Integer.parseInt(arr[i]);


        }
        return String.format("%d %d",max, min);
    }

}
