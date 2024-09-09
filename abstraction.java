abstract class Animal {
    // Abstract method (no body)
    public abstract void sound();
}

class Dog extends Animal {
    // Providing implementation for abstract method
    public void sound() {
        System.out.println("Barks");
    }
}
