package lamdbaexpression.ex5;

public class LambdaExMultiParameter {

    public static void main(String[] args) {
        Addable obj = (int a, int b) -> {// Parameter type is optional here
            return a + b;
        };
        System.out.println("Sum is " + obj.add(10, 12));

        Addable addable = (a, b) -> (a + b);
        System.out.println("Sum is " + addable.add(12, 12));

    }
}
