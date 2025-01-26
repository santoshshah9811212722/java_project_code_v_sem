
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 6) {
            System.out.println("mythread1 is running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override

    public void run() {
        int i = 0;
        while (i < 6) {
            System.out.println("mythread2 is running");
            i++;
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        obj1.start();
        obj2.start();
    }
}
