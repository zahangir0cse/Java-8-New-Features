
package lamdbaexpression.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class LambdaExComparator {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Keyboard", 20000));
        productList.add(new Product(2, "HP Laptop", 530000));
        productList.add(new Product(3, "Computer", 32000));
        
        System.out.println("Sorting on the basis of name...");
        
        Collections.sort(productList, (p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        
        productList.forEach((product) -> {
            System.out.println(product.id + " " + product.name + " " + product.price);
        });
    }
}
