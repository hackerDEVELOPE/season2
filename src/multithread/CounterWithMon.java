package multithread;

public class CounterWithMon {
    private int c;
    private final Object mon = new Object();

    public CounterWithMon() {
        this.c = 0;
    }

    public void inc() {
        synchronized (mon){
            c++;
        }

    }

    public void dec() {
        synchronized (mon){
            c--;
        }

    }

    public int getC() {
        return c;
    }
}
