package season2;

public class Rabbit implements Runnable, Jumpable {
    private final int MAX_JUMP_DIST = 3;
    @Override
    public void run() {
        System.out.println("Rabbit is running");
    }
    @Override
    public boolean jump(int heigth) {
        return heigth <= MAX_JUMP_DIST;
    }
}
