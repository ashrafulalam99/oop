public class OddEvenSum 
{
    public static void OddSum()
    {
        int i = 1, s = 0;

        System.out.print("Odd sum using for loop: ");
        for(i = 1; i < 20; i += 2) s += i;
        System.out.print(s + "\n");

        System.out.print("Odd sum using while loop: ");
        i = 1; s = 0;
        while(i < 20)
        {
            s += i;
            i += 2;
        }
        System.out.print(s + "\n");

        System.out.print("Odd sum using do-while loop: ");
        i = 1; s = 0;
        do
        {
            s += i;
            i += 2;
        }while(i < 20);
        System.out.print(s + "\n");
    }

    public static void EvenSum()
    {
        int i = 2, s = 0;

        System.out.print("Even sum using for loop: ");
        for(i = 2; i <= 20; i += 2) s += i;
        System.out.print(s + "\n");

        System.out.print("Even sum using while loop: ");
        i = 2; s = 0;
        while(i <= 20)
        {
            s += i;
            i += 2;
        }
        System.out.print(s + "\n");

        System.out.print("Even sum using do-while loop: ");
        i = 2; s = 0;
        do
        {
            s += i;
            i += 2;
        }while(i <= 20);
        System.out.print(s + "\n");
    }

    public static void main(String[] args)
    {
        OddSum();
        EvenSum();
    }
}
