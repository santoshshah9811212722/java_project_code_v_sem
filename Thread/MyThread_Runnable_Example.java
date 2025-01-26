
class MyThreadRunnable implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("thread 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("thread 2");
            i++;
        }
    }
}

public class MyThread_Runnable_Example {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}