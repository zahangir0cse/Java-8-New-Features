
package lamdbaexpression.ex3;

public class LambdaExSingleParameter {
    public static void main(String[] args) {
        Sayable s = (name)->{
            System.out.println("Hello " + name);  
        };
        s.say("Zahangir");
    }
}
