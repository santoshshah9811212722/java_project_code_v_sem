
class Checkpriority extends Thread {
    public void run() {
        System.out.println("checking priority" + Thread.currentThread().getPriority());

    }

}

public class ThreadPriority_Example {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        System.out.println("priority check of main class: " + Thread.currentThread().getPriority());

        Checkpriority obj = new Checkpriority();
        obj.setPriority(3);
        obj.start();

    }
}
