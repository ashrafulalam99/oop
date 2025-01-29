import java.util.Scanner;

public class GradeCalculation 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        if(marks >= 90) System.out.print("Your grade is A+");
        else if(marks >= 80) System.out.print("Your grade is A");
        else if(marks >= 70) System.out.print("Your grade is A-");
        else if(marks >= 60) System.out.print("Your grade is B");
        else if(marks >= 40) System.out.print("Your grade is C+");
        else System.out.print("Your grade is F");
        scanner.close();
    }
}
