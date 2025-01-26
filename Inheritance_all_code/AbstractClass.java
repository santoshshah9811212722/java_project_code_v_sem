
//abstract class it is a part of inhertance using abstraction
abstract class parent {
    abstract void parents();
}

class child extends parent {
    void parents() {
        System.out.println("parents class is abstract class");
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        child obj = new child();
        obj.parents();
    }
}
