package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       /* try {
            int a = 10;
            int b = 10;
            System.out.println(a / b);
            try {
                int[] arr = {3, 5, 7};
                System.out.println("тров эксепшан");
                arr[88] = 3;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("inner");
                throw e;
                throw new RuntimeException("Jopa", e);
            }

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e ){
            System.out.println("outer");
        }catch (RuntimeException e) {
            e.printStackTrace();
        }*/

//        System.out.println(mySqrt(-9));

//        try {
//            int a = 10;
//            int b = 0;
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("finally");
//        }

//        readFile("C:\\Users\\lolii\\IdeaProjects\\season2\\src\\1.txt");
//        readFileTryWithResources("C:\\Users\\lolii\\IdeaProjects\\season2\\src\\1.txt");
//        try {
//            readFile1("C:\\Users\\lolii\\IdeaProjects\\season2\\src\\1.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            System.out.println(factorial(-10));
        }catch (FactorialException e){
            e.printStackTrace();
            System.out.println("Аргумент: "+e.getNumber());
        }
        System.out.println("end");
    }

    public static void readFile1(String filename) throws IOException {
        try (FileReader fileReader = new FileReader(filename)) {
            int x;
            while ((x = fileReader.read()) > 0) {
                System.out.print((char) x);
            }
        }
    }

    public static void readFileTryWithResources(String filename) {
        try (FileReader fileReader = new FileReader(filename)) {
            int x;
            while ((x = fileReader.read()) > 0) {
                System.out.print((char) x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int factorial(int n) throws FactorialException {
        if (n < 0) {
            throw new FactorialException("Только для положительного числа: " + n, n);
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void readFile(String filename) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
            int x;

            while ((x = fileReader.read()) > 0) {
                System.out.print((char) x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static double mySqrt(double x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("x<0" + x);
        }
        return Math.sqrt(x);
    }

}