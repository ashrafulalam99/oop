import java.util.Scanner;

public class EqTraArea 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.printf("The area of the equilateral triangle is: %.5f%n", area);

        scanner.close();
    }
}
