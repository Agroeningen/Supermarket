package nl.yacht.holder;

import java.util.ArrayList;
import java.util.Arrays;

public class Supermarkt {

    public void createProductList() {
        ArrayList<Product> productList = new ArrayList<Product>();

        Product product1 = new Product("p1", "Frikandellbroodje", "0", 1.0);
        Product product2 = new Product("p2", "Pampers", "0", 9.99);
        Product product3 = new Product("p3", "Kipfilet", "0", 2.40);
        Product product4 = new Product("p4", "Ijsthee", "0", 0.99);

        productList.add(0, product1);
        productList.add(1, product2);
        productList.add(2, product3);
        productList.add(3, product4);

        for(Product p: productList){
            System.out.println(p.getName());

    }

    }
}
