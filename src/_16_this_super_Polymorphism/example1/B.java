package _16_this_super_Polymorphism.example1;

public class B extends A {

    public B() {
        super(10);
        System.out.println("B");
    }

    public B(int x) {
        this();
        System.out.println("B'");
    }
}
