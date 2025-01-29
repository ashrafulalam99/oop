import java.util.Scanner;

public class Medel
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double Gd = scan.nextDouble();

        System.out.print("Did you complete the semseter? Yes or no: ");
        String s = scan.next();

        if(s.equals("Yes"))
        {
            if(Gd >= 3.5) System.out.print("Congrats You got the medel");
            else System.out.print("Work harder");
        }
        else System.out.print("Complete the semester");
        
        scan.close();
    }
}
