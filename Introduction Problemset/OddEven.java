import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if(number % 2 == 0) System.out.print("The number " + number + " is even.");
        else System.out.print("The number " + number + " is odd.");
        scanner.close();
    }
}