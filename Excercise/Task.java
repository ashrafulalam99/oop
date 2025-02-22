package Exercise;

import java.util.Scanner;

class Order {
    int quantity1;
    int quantity2;
    String customerName;
    String customerAddress;
    String foodName1 = "Burger";
    String foodName2 = "Pizza";
    double price1 = 5.99;
    double price2 = 8.99;
    boolean isCanceled = false;
}

class OrderInput extends Order {
    void takeOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        customerName = sc.nextLine();
        System.out.print("Enter your address: ");
        customerAddress = sc.nextLine();

        System.out.println("1. " + foodName1 + " - $" + price1);
        System.out.println("2. " + foodName2 + " - $" + price2);
        System.out.print("Choose item (1 or 2): ");
        int choice = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        
        switch (choice) {
            case 1 -> quantity1 = quantity;
            case 2 -> quantity2 = quantity;
            default -> System.out.println("Invalid choice!");
        }
    }
}

class FoodOrderingSystem extends OrderInput {
    void generateBill() {
        if (isCanceled) {
            System.out.println("Order was canceled. No bill generated.");
            return;
        }
        double total = (quantity1 * price1) + (quantity2 * price2);
        System.out.println("===== BILL =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        if (quantity1 > 0) {
            System.out.println(foodName1 + " x " + quantity1 + " = $" + (quantity1 * price1));
        }
        if (quantity2 > 0) {
            System.out.println(foodName2 + " x " + quantity2 + " = $" + (quantity2 * price2));
        }
        System.out.println("Total Amount: $" + total);
    }

    void cancelOrder() {
        isCanceled = true;
        System.out.println("Your order has been canceled.");
    }
}

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodOrderingSystem order = new FoodOrderingSystem();
        order.takeOrder();
        
        System.out.print("Do you want to cancel the order? (yes/no): ");
        String cancelChoice = sc.next();
        if (cancelChoice.equalsIgnoreCase("yes")) {
            order.isCanceled = true;
        } 

        order.generateBill();
    }
}
