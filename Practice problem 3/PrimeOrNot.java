import java.util.Scanner;

public class PrimeOrNot 
{
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        if(n <= 3) return true;

        for(int i = 3; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        if(isPrime(num)) System.out.print(num + " is prime");
        else System.out.print(num + " is not prime");

        scan.close();
    }
}
