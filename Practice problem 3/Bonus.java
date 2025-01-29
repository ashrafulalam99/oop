import java.util.Scanner;

public class Bonus 
{
    public static void main(String[] args) 
    {
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter the achieved sales: ");
        int sell = scan.nextInt();

        System.out.print("Enter the attendence: ");
        int att = scan.nextInt();

        if(sell >= 95 && att == 100) System.out.print("60% Bonus");
        else if((sell >= 95 && att >= 90) || (sell >= 80 && att == 100)) System.out.print("40% bonus");
        else if(sell >=80 && att >= 90) System.out.print("20% bonus");
        else System.out.print("5% bonus");

        scan.close();
    }
}
