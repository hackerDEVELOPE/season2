package season2;

public class Cat implements Runnable, Jumpable {
    private String name;
    private final int MAX_JUMP_DIST = 3;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("cat :" + name + " is running");
    }

    @Override
    public boolean jump(int heigth) {
        return heigth <= MAX_JUMP_DIST;
    }
}
