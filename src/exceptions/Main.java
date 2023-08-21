package exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            a();
        }catch (ArithmeticException e ){
            e.printStackTrace();
        }
        System.out.println("end");
    }
    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        d();
    }
    public static void d(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

}