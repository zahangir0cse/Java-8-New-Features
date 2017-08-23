package lamdbaexpression.ex6;

import java.util.ArrayList;
import java.util.List;

public class LambdaExForEach {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zahangir Alam");
        names.add("Mahmud");
        names.add("Tawfiq");
        names.forEach(
                (n) -> System.out.println(n)
        );
    }
}
