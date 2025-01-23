package Inheritance_all_code;

//using normal class "extends" them to achieve multileve inheritance.
class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

class mammal extends Animal {
    void walk() {
        System.out.println("dog is walking");
    }
}

class Dog extends mammal {
    void bark() {
        System.out.println("dog is barking");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.walk();
        obj.eat();
    }
}
