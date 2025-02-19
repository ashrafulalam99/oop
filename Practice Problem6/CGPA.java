import java.util.Scanner;

public class CGPA
{

    public static void main(String[] args) {
        int students = 5;
        int subjects = 5;
        double[][] gradePoints = new double[students][subjects];
        double[] credits = {3, 4, 3, 2, 3};
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < students; i++) {
            System.out.println("Enter grades for student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + " Grade Points: ");
                gradePoints[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < students; i++) {
            double weightedSum = 0;
            double totalCredits = 0;
            
            for (int j = 0; j < subjects; j++) {
                weightedSum += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }
            
            double cgpa = weightedSum / totalCredits;
            System.out.println("CGPA for Student " + (i + 1) + ": " + cgpa);
        }

        scan.close();
    }
}
