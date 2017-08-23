
package lamdbaexpression.ex7;

public class LambdaExThread {
    public static void main(String[] args) {
        //without lambda
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running...");
            }
        };
        Thread t = new Thread(r);
        t.start();
        //with lambda
        Runnable r1 = ()->{
            System.out.println("Thread 2 is running...");  
        };
        
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
