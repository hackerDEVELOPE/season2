package season2.hm;

public class Bot implements JumpoRun{
    static int jumpDist = 10;
    static int runDist = 40;
    private String name;

    public Bot(String name) {
        this.name = name;
    }
    @Override
    public boolean jump(Wall w) {
        System.out.println("ботик " + name +" был прыгал");
        System.out.println(w.getHeight() < jumpDist ? "прыжок был успешен" : "прыжок был плох");
        System.out.println();
        return w.getHeight() < jumpDist;
    }
    @Override
    public boolean run(Treadmill t) {
        System.out.println("ботик " +name +" был бегающим" );
        System.out.println(t.getDist() < runDist ? "бег был прекрасен" : "бег был ужасен");
        System.out.println();
        return t.getDist() < runDist;
    }

}
