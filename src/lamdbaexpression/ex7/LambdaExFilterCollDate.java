package lamdbaexpression.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExFilterCollDate {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Keyboard", 20000));
        productList.add(new Product(2, "HP Laptop", 530000));
        productList.add(new Product(3, "Computer", 32000));
        
        Stream<Product> stream = productList.stream().filter(p->p.price>20000);
        stream.forEach(
                product->System.out.println(product.id + " " + product.name + " " + product.price)
        );
    }

}
