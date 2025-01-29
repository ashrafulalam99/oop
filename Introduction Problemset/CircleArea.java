import java.util.Scanner;

public class CircleArea 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area
        double area = Math.PI * Math.pow(radius, 2);

        // Output the area with 5 decimal places
        System.out.printf("The area of the circle is: %.5f%n", area);

        scanner.close();
    }
}
