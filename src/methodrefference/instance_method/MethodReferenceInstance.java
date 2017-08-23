package methodrefference.instance_method;

import java.util.function.BiFunction;

interface Sayable {

    void say();
}

class Arithmetic {

    public int add(int a, int b) {
        return a + b;
    }

    public float add(int a, float b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }
}

public class MethodReferenceInstance {

    public void saySomething() {
        System.out.println("Hello, Instance method reference");
    }

    public void threadStatus() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Sayable s = new MethodReferenceInstance()::saySomething;
        s.say();
        Thread thread = new Thread(new MethodReferenceInstance()::threadStatus);
        thread.start();

        BiFunction<Integer, Integer, Integer> adder1 = new Arithmetic()::add;
        BiFunction<Integer, Float, Float> adder2 = new Arithmetic()::add;
        BiFunction<Float, Float, Float> adder3 = new Arithmetic()::add;

        System.out.println(adder1.apply(12, 13));
        System.out.println(adder2.apply(12, 13.01f));
        System.out.println(adder3.apply(12.02f, 13.02f));
    }
}
