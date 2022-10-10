package _16_this_super_Polymorphism.example3;

public class B extends A {

    String x;
    String y;

    public B() {
        this.x = ":|";
        super.x = 20;

        this.y = ":)";
    }

    public void m() {
        this.x = ":|";
        super.x = 30;
        this.y = ":(";
    }
}
