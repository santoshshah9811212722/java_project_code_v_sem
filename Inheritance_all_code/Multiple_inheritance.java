
//multiple inheritance using interface that inheritated from normal class using implements keyword.
package Inheritance_all_code;

interface Flyable {
    void fly();

}

interface Swimable {
    void swim();

}

class Bird implements Flyable, Swimable {
    public void fly() {
        System.out.println("bird is flying");
    }

    public void swim() {
        System.out.println("bird is swimming");
    }
}

public class Multiple_inheritance {
    public static void main(String[] args) {
        Bird obj = new Bird();
        obj.fly();
        obj.swim();
    }
}
