package multithread;

public class HW {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        oneThread();
        duoThread();
    }

    static void duoThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] arr1 = new float[HALF];
                System.arraycopy(arr, 0, arr1, 0, HALF);
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

                }
                System.arraycopy(arr1, 0, arr, 0, HALF);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] arr2 = new float[HALF];
                System.arraycopy(arr, HALF, arr2, 0, HALF);
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (i+HALF) / 5) * Math.cos(0.2f + (i+HALF) / 5) * Math.cos(0.4f + (i+HALF) / 2));

                }
                System.arraycopy(arr2, 0, arr, HALF, HALF);

            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[HALF]);
    }

    static void oneThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[HALF]);
    }

}
