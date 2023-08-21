package season2.hm;

public class Human implements JumpoRun {
    private final int JUMP_DIST = 20;
    private final int RUN_DIST = 100;

    @Override
    public int getJUMP_DIST() {
        return JUMP_DIST;
    }

    @Override
    public int getRUN_DIST() {
        return RUN_DIST;
    }

    @Override
    public String getName() {
        return name;
    }

    private String name;

    public Human(String name) {
        this.name = name;
    }

}
