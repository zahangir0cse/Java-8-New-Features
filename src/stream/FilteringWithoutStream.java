/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
}

public class FilteringWithoutStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Keyboard", 1200f));
        products.add(new Product(2, "Monitor", 1700f));
        products.add(new Product(3, "Mouse", 300f));
        products.add(new Product(4, "HP Laptop", 53000f));
        products.add(new Product(5, "RAM", 1500f));
        List<Float> productPriceList = new ArrayList<>(); 
        for (Product product : products) {
            if (product.price>1000) {
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);
    }
}
