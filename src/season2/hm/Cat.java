package season2.hm;

public class Cat implements JumpoRun{
    private final int JUMP_DIST = 40;
    private final int RUN_DIST = 120;
    private String name;

    public int getJUMP_DIST() {
        return JUMP_DIST;
    }

    public int getRUN_DIST() {
        return RUN_DIST;
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }
}
