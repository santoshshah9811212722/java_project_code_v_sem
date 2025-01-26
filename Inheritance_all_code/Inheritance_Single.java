
//single inhertace using normal class extent by other normal class.

class animal {
    void eat() {
        System.out.println("eating");
    }
}

class dog extends animal {
    void sound() {
        System.out.println("bark");
    }
}

public class Inheritance_Single {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.eat();
        obj.sound();
    }
}
