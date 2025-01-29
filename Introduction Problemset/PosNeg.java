import java.util.Scanner;

public class PosNeg
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if(number > 0) System.out.print("The number " + number + " is positive.");
        else if(number < 0) System.out.print("The number " + number + " is negative.");
        else System.out.print("The number " + number + " is zero.");
        scanner.close();
    }
}