/*
 * An Interface that contains exactly one abstract method is known as functional interface. 
 * It can have any number of default, static methods but can contain only one abstract method. 
 * It can also declare methods of object class.
 * Functional Interface also known as Single Abstract Method Interfaces or SAM Interfaces.
 * It helps to achieve functional programming approach.
 */
package functionalInterface;

@FunctionalInterface
interface Sayable {

    void say(String message);

    //int doSum(int a, int b);//This is not acceptable here. Because it's functional interface
}

//Functional interface can have one more methods of Object class
@FunctionalInterface
interface Sumable {

    int doSum(int x, int y);

    //methods of object class
    String toString();

    int hashCode();
}

//A functional interface can extends to other interface only when that does not have any abstract method.

interface Writeable{
   default void write(){
       System.out.println("write it");
   }
   void read();
}
@FunctionalInterface
interface Doable extends Writeable{
    static void doIt(){
        System.out.println("Hello functional interface");
    }
    // Invalid '@FunctionalInterface' annotation; doable is not a functional interface
    //void doIt();
}

//a functional interface is extending to a non-functional interface.

interface Playable{
    default void play(){
        System.out.println("Play Football");
    }
}
@FunctionalInterface
interface Gameable extends Playable{
    void playGame();
}

public class FunctionalInterfaceEx {

    public static void main(String[] args) {
        Sayable s = (String message) -> {
            System.out.println(message);
        };
        s.say("Hello Functional Interface");

//    Sumable sum = (a, b) -> {
//        return a + b;
//    };
        Sumable sumable = (a, b) -> (a + b);

        System.out.println("Sum is: " + sumable.doSum(4, 7));
        
        Doable doable = ()->{
            System.out.println("Do it");  
        };
        doable.read();
        doable.write();
        Doable.doIt();
        
        Gameable gameable = ()->{
            System.out.println("Play Game");  
        };
        gameable.playGame();
        gameable.play();

    }
}
