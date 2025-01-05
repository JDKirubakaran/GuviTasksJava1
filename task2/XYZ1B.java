package com.guvi.day4.task2;

import java.util.Scanner;

public class XYZ1B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product1B[] products = new Product1B[5];
        // Accepting product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product " + (i + 1) + " information:");
            System.out.print("Enter product ID: ");
            int pID = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product1B(pID, price, quantity);
        }
        // Finding pID of the product with the highest price
        int maxpID = products[0].pID;
        double maxPrice = products[0].price;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxpID = products[i].pID;
            }
        }
        System.out.println("Product ID of the product with the highest price: " + maxpID);
        // Calculating total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
        scanner.close();
    }
    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product1B[] products) {
        double totalAmount = 0;
        for (Product1B product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }
}

