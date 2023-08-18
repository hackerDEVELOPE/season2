package season2.outer;

public class Outer {
    private Inner inner;
    private Inner[] inners;
    private int x;

    public Outer() {
        inner = new Inner(4, 5);
        x = 8;
        inners = new Inner[]{new Inner(1, 3), new Inner(11, 2), new Inner(42, 21)};
    }

    class Inner {
        int x;
        int y;

        public Inner(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void printSum() {
            System.out.println(x + y);
        }

    }

    static class StClass {
        public void test(){
            System.out.println("test");
        }
    }
}
