class Restaurant {
    String name;
    Restaurant(String name) {
        this.name = name;
    }

    int estimateDeliveryTime() {
        return 40;
    }

    double Tax(double foodPrice) {
        return foodPrice * 0.10;
    }

    double TotalBill(double foodPrice) {
        double tax = Tax(foodPrice);
        return foodPrice + tax;
    }

    void displayInfo(double foodPrice) {
        System.out.println(this.name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
        System.out.println("Total Bill (Tax added): " + TotalBill(foodPrice));
    }
}

class FastFoodRestaurant extends Restaurant {

    FastFoodRestaurant(String name) {
        super(name);
    }

    @Override
    int estimateDeliveryTime() {
        return 20;
    }

    @Override
    double Tax(double foodPrice) {
        return foodPrice * 0.15;
    }
}

class FineDiningRestaurant extends Restaurant {

    FineDiningRestaurant(String name) {
        super(name);
    }

    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}

public class ResturantSystem{
    public static void main(String[] args) {
        double foodPrice = 200.0;

        Restaurant genericRestaurant = new Restaurant("Normal Restaurant");
        FastFoodRestaurant fastFood = new FastFoodRestaurant("Fast-Food Restaurant");
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Luxury-Food Restaurant");

        genericRestaurant.displayInfo(foodPrice);
        System.out.println();
        fastFood.displayInfo(foodPrice);
        System.out.println();
        fineDining.displayInfo(foodPrice);
    }
}
