class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound(); // Output: Barks
        myCat.sound(); // Output: Meows
    }
}
