package season2.hm;

public interface Obstacles {
    /*    default void overcome(JumpoRun j, Wall w) {
            j.jump(w);
        }
        default void overcome(JumpoRun j, Treadmill t){
            j.run(t);
        }*/
    default boolean overcome(JumpoRun j, Obstacles o) {
        if (o instanceof Wall) {
            return j.jump(j, (Wall) o);
        } else {
            return j.run(j, (Treadmill) o);
        }
    }
}
