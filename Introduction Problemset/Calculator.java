import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.print("Enter the opertor: ");
        char c = scan.next().charAt(0);

        if(c == '+') System.out.print("The result is " + (a + b));
        else if(c == '-') System.out.print("The result is " + (a - b));
        else if(c == '*') System.out.print("The result is " + (a * b));
        else System.out.print("The result is " + (a / b));
        scan.close();
    }
}
