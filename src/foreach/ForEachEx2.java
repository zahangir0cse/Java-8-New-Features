package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("PHP");
        list.add("C++");
        
        System.out.println("---- Programming Books ----");
        //Iterating by passing method reference
        list.forEach(System.out::println);
    }
}
