package _18AbstractClassesInterfaces.example1;

public class Cat extends Pet {

    public Cat() {
        super("Tom");

        // after
    }

    public void sayMeow() {
        System.out.println("Meow! My name " + this.name);
    }
}
