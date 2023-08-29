package multithread;

public class myThread extends Thread{

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ Thread.currentThread().getName());
        }
    }
}
