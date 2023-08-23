package season2.hm;

public class Bot implements JumpoRun{
    private final int JUMP_DIST = 10;
    private final int RUN_DIST = 40;
    private String name;

    public Bot(String name) {
        this.name = name;
    }

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
}
