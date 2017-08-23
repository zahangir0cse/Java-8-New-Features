/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdbaexpression.ex4;

/**
 *
 * @author Zahangir Alam
 */
public class LambdaExReturn {
    public static void main(String[] args) {
        Sayable s = (nameNew)->{
           return "Hello " + nameNew;
        };
        System.out.println(s.say("Zahangir"));
        
        Sayable s1 = (name) ->("Hello "+ name);
        System.out.println(s1.say("Mahmud"));
    }
    
}
