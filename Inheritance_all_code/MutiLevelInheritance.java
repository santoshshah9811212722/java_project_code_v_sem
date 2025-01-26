
//multilevel inheritance using extend and implements

interface king {
    void eat();
}

interface cat extends king {
    void dog();

    default void eat() {
        System.out.println("cat eating");
    }

}

class Wow implements cat {
    public void dog() {
        System.out.println("dog is a mammal");
    }

}

public class MutiLevelInheritance {
    public static void main(String[] args) {
        Wow obj = new Wow();
        obj.dog();
        obj.eat();
    }
}
