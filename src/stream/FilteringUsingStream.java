/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1{
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
}

public class FilteringUsingStream {
    public static void main(String[] args) {
        List<Product1> products = new ArrayList<>();
        products.add(new Product1(1, "Keyboard", 1200f));
        products.add(new Product1(2, "Monitor", 1700f));
        products.add(new Product1(3, "Mouse", 300f));
        products.add(new Product1(4, "HP Laptop", 53000f));
        products.add(new Product1(5, "RAM", 1500f));
        List<Float> productPriceList = products.stream().filter(p->p.price>1000).map(p->p.price).collect(Collectors.toList());
        System.out.println(productPriceList);
}
}