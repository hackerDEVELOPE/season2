package season2.outer;

public class MainApp {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner(1, 3);

        Outer.StClass st = new Outer.StClass();
    }
    public void testLocalClass(){
        class LocalCl {
            int a;
            int b;

            public LocalCl(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }

        LocalCl lc = new LocalCl(4,5);
    }
}
