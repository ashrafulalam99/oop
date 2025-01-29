import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total number of values: ");
        int n = scan.nextInt();

        double [] a = new double[n];
        double sum = 0;
        System.out.print("Enter values: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextDouble();
            sum += a[i];
        }

        double Avg = sum / n;
        System.out.print("Averag is " + Avg);
        scan.close();
    }
}