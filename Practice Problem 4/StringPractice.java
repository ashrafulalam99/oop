import java.util.Scanner;

public class StringPractice
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = scan.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
        
        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        
        System.out.println("Enter the character: ");
        char target = scan.next().charAt(0);
        int cnt = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        
        scan.close();
    }
}