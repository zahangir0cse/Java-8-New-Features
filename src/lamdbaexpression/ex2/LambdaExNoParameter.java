
package lamdbaexpression.ex2;

public class LambdaExNoParameter {
    public static void main(String[] args) {
        Sayable s = ()->{
            System.out.println("I have nothing to say");
        };
        s.say();
    }
}
