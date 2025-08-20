package com.fullstackabi.assignment.Assign9.Ex2Map;

import java.util.*;

public class ProductCatalogDriver {
    public static void main(String[] args) {

        Map<Integer, Product> products = new HashMap<>();

        // CRUD operations
        // Add a new product
        products.put(104, new Product(104, "product5", 500.00));
        products.put(102, new Product(102, "product3", 300.00));
        products.put(101, new Product(101, "product2", 200.00));
        products.put(100, new Product(100, "product1", 100.00));
        products.put(103, new Product(103, "product4", 400.00));


        // duplicate key not allowed but duplicate values are allowed
        // products.put(3,new Product(105,"product1",600.00));
        products.put(105, new Product(105, "product1", 600.00));
        System.out.println("ProductCatalog List");
        System.out.println(products);

        // Remove a product
        products.remove(105);
        System.out.println("Product with Key 105 removed");
        System.out.println(products);

        // Update a product name ,price
        Product updateProductName = products.get(104);
        updateProductName.setProductName("NewProduct5");
        updateProductName.setProductPrice(1000.00);
        System.out.println("Product Name,Price with Key 5 updated ");
        System.out.println(products);


        // View all products
        for (Product product : products.values()) {
            System.out.println(product);
        }

        //Searching with a product ID , find all products cheaper than given price.
        for (Product product : products.values()) {
            if (product.getProductId() == 105) {
                System.out.println("Product Details Found");
                System.out.println(product);
                break;
            }
        }
        System.out.println("Products with price less than 1000 Rupees");
        for (Product product : products.values()) {
            if (product.getProductPrice() < 1000.00) {
                System.out.println(product);
            }
        }

        // Sorting - By Product name ; by Price (ascending/descending order)
        System.out.println("Products sorted by Price ");

        // Create an instance of the custom Comparator
        Comparator<Product> priceComparator = new ProductPriceComparator();

        // Initialize the TreeMap with the custom Comparator
        Map<Product,Integer> sortedMap = new TreeMap<>(priceComparator);

        for(Product product : sortedMap.keySet()){
            System.out.println("Sorted Map");
            System.out.println(product);
        }

        // The keys (Product objects) are automatically sorted by price
        // Iterate and print the sorted map
//        for(Product product : products.values()){
//            System.out.println(sortedMap.get(product));
//        }
//        for (Map.Entry<Product, String> entry : sortedMap.entrySet()) {
//            System.out.println("Product: " + entry.getKey() + ", Category: " + entry.getValue());
//        }


    }
}
