package lamdbaexpression.ex1;

public class LambdaEx {

    public static void main(String[] args) {
        int width = 10;
        // with out Lembda
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();

        new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing new " + width);
            }
        }.draw();
        
        //With Lambda
        Drawable dl = () -> {
            System.out.println("Drawing Lambda " + width);
        };
        dl.draw();

        //This is not possible    
//        ()->{
//            System.out.println("Drawing Lambda new" + width);
//        }.draw();
    }
}
