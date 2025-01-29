import java.util.Scanner;

public class FindArea 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("The area of the triangle is: %.5f%n", area);

        scanner.close();
    }
}
