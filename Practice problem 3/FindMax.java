import java.util.Scanner;

public class FindMax
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();

        int[] a = new int[n];
        int max = 0;
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++) 
        {
            a[i] = scan.nextInt();
            max = Math.max(max,a[i]);
        }

        System.out.print("Greatest number is " + max);
        scan.close();
    }
}
