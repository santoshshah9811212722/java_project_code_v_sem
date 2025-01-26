// package ExceptionalHandling;
// class division extends ExceptionBound {

// }

public class ExceptionBound {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            System.out.println(array[8]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + "error");
        }
    }
}
