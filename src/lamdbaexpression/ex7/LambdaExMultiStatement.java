package lamdbaexpression.ex7;

public class LambdaExMultiStatement {

    public static void main(String[] args) {
        Sayable s = ((message) -> {
            System.out.println("Hello ...");
            String msg1 = "I would like to say, ";
            msg1 += message;
            return msg1;
        });
        
        System.out.println(s.say("Time is a valuable thing."));
    }
}
