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
public class ForEachEx1 {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("PHP");
        list.add("C++");
        System.out.println("---- Programming Books ----");
        //Iterating by passing Lambda Expression
        list.forEach((programmingBooks)->{
            System.out.println(programmingBooks);
        });
        
    }
    
}
