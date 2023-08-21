package season2.hm;

public class Treadmill implements Obstacles {
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    public int getDist() {
        return dist;
    }
}
