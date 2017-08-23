/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zahangir Alam
 */
public class ForEachOrderedEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("PHP");
        list.add("C++");
        
        System.out.println("---- Iterating Programming Books using Lambda----");
        
        list.stream().forEachOrdered((programmingBooks)->{
            System.out.println(programmingBooks);
        });
        
        System.out.println("---- Iterating Programming Books using method reference----");
        list.stream().forEachOrdered(System.out::println);
    }
}
