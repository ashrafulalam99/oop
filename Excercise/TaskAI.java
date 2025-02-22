import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class OrderSystem {
    protected String customerName;
    protected String customerAddress;
    protected List<OrderItem> orderItems = new ArrayList<>();
    
    abstract void takeOrder();
    abstract void generateBill();
    abstract void cancelOrder();
}

class OrderItem {
    private String foodName;
    private double price;
    private int quantity;

    public OrderItem(String foodName, double price, int quantity) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return foodName + " x " + quantity + " = $" + getTotalPrice();
    }
}

class FoodOrderingSystem extends OrderSystem {
    private final String[] foodNames = {"Burger", "Pizza", "Pasta"};
    private final double[] prices = {5.99, 8.99, 7.49};

    @Override
    void takeOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        customerName = sc.nextLine();
        System.out.print("Enter your address: ");
        customerAddress = sc.nextLine();
        System.out.println("Menu:");

        for (int i = 0; i < foodNames.length; i++) 
        {
            System.out.println((i + 1) + ". " + foodNames[i] + " - $" + prices[i]);
        }
        System.out.print("Choose item (1-" + foodNames.length + ") or 0 to finish: ");

        while (true) {
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice < 1 || choice > foodNames.length) {
                System.out.println("Invalid choice!");
                continue;
            }
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            orderItems.add(new OrderItem(foodNames[choice - 1], prices[choice - 1], quantity));
            System.out.print("Choose again (1-" + foodNames.length + ") or 0 to finish: ");
        }
    }

    @Override
    void generateBill() {
        if (orderItems.isEmpty()) {
            System.out.println("No order placed.");
            return;
        }
        System.out.println("===== BILL =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        double total = 0;
        for (OrderItem item : orderItems) {
            System.out.println(item);
            total += item.getTotalPrice();
        }
        System.out.println("Total Amount: $" + total);
    }

    @Override
    void cancelOrder() {
        orderItems.clear();
        System.out.println("Your order has been canceled.");
    }
}

public class TaskAI 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodOrderingSystem order = new FoodOrderingSystem();
        order.takeOrder();
        
        System.out.print("Do you want to cancel the order? (yes/no): ");
        String cancelChoice = sc.next();
        if (cancelChoice.equalsIgnoreCase("yes")) {
            order.cancelOrder();
        } else {
            order.generateBill();
        }
    }
}
