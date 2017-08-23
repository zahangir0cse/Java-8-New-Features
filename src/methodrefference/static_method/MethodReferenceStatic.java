package methodrefference.static_method;

import java.util.function.BiFunction;

interface Sayable {

    void say();
}

class Arithmetic {

    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }
}

public class MethodReferenceStatic {

    public static void saySomething() {
        System.out.println("Hello, Static method reference");
    }

    public static void threadStatus() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Sayable s = MethodReferenceStatic::saySomething;
        s.say();
        Thread thread = new Thread(MethodReferenceStatic::threadStatus);
        thread.start();
        
        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
        
        System.out.println(adder1.apply(12, 13));
        System.out.println(adder2.apply(12, 13.01f));
        System.out.println(adder3.apply(12.02f, 13.02f));
    }

}
