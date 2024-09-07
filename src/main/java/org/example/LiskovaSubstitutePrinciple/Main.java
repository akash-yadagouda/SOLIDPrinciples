package org.example.LiskovaSubstitutePrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(10);
        Product product2 = new Product(10);
        // LSP
        Product product3 = new InHouseProduct(10);

        List<Product> productList = List.of(product1, product2, product3);
        productList.forEach(
                product -> {
                    System.out.println(product.getDiscount());
                }
        );

    }


}
