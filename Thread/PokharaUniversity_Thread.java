
class DisplayMessage extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Pokhara University");
        }

    }

}

public class PokharaUniversity_Thread {
    public static void main(String[] args) {
        DisplayMessage obj = new DisplayMessage();
        obj.start();
    }
}
