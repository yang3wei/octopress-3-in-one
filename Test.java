import java.io.*;

public class Test {

    public Test() {
        System.out.println("My name is yang3wei!");
    }

    public void eat() {
        System.out.println("I eat something~");
    }

    public void greet() {
        System.out.println("Hello everyone!");
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.eat();
        test.greet();
    }
}
