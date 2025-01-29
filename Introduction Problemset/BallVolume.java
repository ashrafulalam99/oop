import java.util.Scanner;

public class BallVolume 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the ball: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the ball is: " + volume);
        
        scanner.close();
    }
}
