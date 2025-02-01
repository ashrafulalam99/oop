import java.util.Scanner;
class Product 
{
    String name, category, brand;
    double price;

    public Product(String name, String category, String brand, double price)
    {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
    }

    public void display()
    {
        System.out.println(name + " - " + category + " - " + brand + " - "  + price);
    }
}

class Productfilter
{
    Product[] products;
    public Productfilter(Product[] products) 
    {
        this.products = products;
    }

    public void filter(String category)
    {
        int count = 0;
        for(Product p: products)
        {
            if(p.category.equals(category))
            {
                p.display();
                count++;
            }
        }
        if(count == 0) System.out.println("Sorry, not available");
    }

    public void filterBrand(String brand)
    {
        int count = 0;
        for(Product p: products)
        {
            if(p.brand.equals(brand))
            {
                p.display();
                count++;
            }
        }
        if(count == 0) System.out.println("Sorry, not available");
    }
    public void filter(double min, double max)
    {
        int count = 0;
        for(Product p: products)
        {
            if(p.price >= min && p.price <= max)
            {
                p.display();
                count++;
            }
        }
        if(count == 0) System.out.println("Sorry, not available");
    }

    public void filter(String category, double min, double max)
    {
        int count = 0;
        for(Product p: products)
        {
            if(p.category.equals(category) && p.price >= min && p.price <= max)
            {
                p.display();
                count++;
            }
        }
        if(count == 0) System.out.println("Sorry, not available");
    }

    public void filter(String category, String brand, double min, double max)
    {
        int count = 0;
        for(Product p: products)
        {
            if(p.category.equals(category) && p.brand.equals(brand) && p.price >= min && p.price <= max)
            {
                p.display();
                count++;
            }
        }
        if(count == 0) System.out.println("Sorry, not available");
    }
}

public class SearchingProuduct
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Product[] products =
        {
            new Product("Laptop", "Electronics", "Dell", 120000),
            new Product("Laptop", "Electronics", "Asus", 100000),
            new Product("Rice", "Food", "Meghna", 62),
            new Product("Rice", "Food", "Padma", 68.5),
            new Product("Oil", "Food", "Padma", 180),
            new Product("Toy Car", "Toy", "Hot wheel", 5000),
            new Product("Napa", "Medicine", "Square", 50),
            new Product("Surgel", "Medicine", "Square", 100),
            new Product("Table", "Furniture", "Hatil", 14000),
            new Product("Table", "Furniture", "RFL", 6000)
        };

        Productfilter filter = new Productfilter(products);

        System.out.println("Enter your category: ");
        String ct = scan.next();
        System.out.println("\nFilter by category " + ct + ":");
        filter.filter(ct);

        System.out.println("Enter your price range(min and max limit): ");
        double min = scan.nextDouble();
        double max = scan.nextDouble();
        System.out.println("\nFilter by price range:");
        filter.filter(min, max);

        System.out.println("Enter your preferable brand: ");
        String br = scan.next();
        System.out.println("\nFilter by brand " + br + ":");
        filter.filterBrand(br);

        System.out.println("Enter your category and price range(min and max limit): ");
        ct = scan.next();
        min = scan.nextDouble();
        max = scan.nextDouble();
        System.out.println("\nFilter by category & price range(" + ct + ", " + min + ", " + max + "):");
        filter.filter(ct, min, max);

        System.out.println("Enter your category, brand and price range(min and max limit): ");
        ct = scan.next();
        br = scan.next();
        min = scan.nextDouble();
        max = scan.nextDouble();
        System.out.println("\nFilter by category, price range & brand (" + ct + ", " + min + ", " + max + ", " + br + "):");
        filter.filter(ct, br, min, max);   
    }
}