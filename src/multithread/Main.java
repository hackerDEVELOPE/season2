package multithread;

public class Main {
    public static void main(String[] args) {
//        myThread t1= new myThread("t1");
//        myThread t2= new myThread("t2");
//
//        t1.start();
//        t2.start();

//        Thread t3 = new Thread(new myRunnable());
//
//        Thread t4 = new Thread(new myRunnable());
//
//        t3.start();
//        t4.start();

//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i +" "+ Thread.currentThread().getName());
//            }
//        });

//        Thread t1 = new Thread(() -> {
//            System.out.println(1);
//        });
//        Thread t2 = new Thread(() -> {
//            System.out.println(2);
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(3);
//        Counter counter = new Counter();
//        CounterWithMon counter = new CounterWithMon();
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                counter.inc();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//
//            for (int i = 0; i < 1000000; i++) {
//                counter.dec();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(counter.getC());

//        Thread timer = new Thread(new Runnable() {
//            int seconds = 0;
//            boolean flag = true;
//            @Override
//            public void run() {
//                while (!Thread.currentThread().isInterrupted()&& flag){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        Thread.currentThread().interrupt();
//                        break;
//                        flag = false;
//                    }
//                    seconds++;
//                    System.out.println("Time: "+ seconds +" s.");
//                }
//            }
//        });
//        timer.setDaemon(true);

//        timer.start();
//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        timer.interrupt();
//        System.out.println("end");


    }

}
