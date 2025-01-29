public class NumberSeries 
{
    public static void Odd()
    {
        int i = 1;

        System.out.print("Odd series using for loop: ");
        for(i = 1; i < 20; i += 2) System.out.print(i + " ");
        System.out.print("\n");

        System.out.print("Odd series using while loop: ");
        i = 1;
        while(i < 20)
        {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.print("\n");

        System.out.print("Odd series using do-while loop: ");
        i = 1;
        do
        {
            System.out.print(i + " ");
            i += 2;
        }while(i < 20);
        System.out.print("\n");
    }

    public static void Even()
    {
        int i = 2;

        System.out.print("Even series using for loop: ");
        for(i = 2; i <= 20; i += 2) System.out.print(i + " ");
        System.out.print("\n");

        System.out.print("Even series using while loop: ");
        i = 2;
        while(i <= 20)
        {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.print("\n");

        System.out.print("Even series using do-while loop: ");
        i = 2;
        do
        {
            System.out.print(i + " ");
            i += 2;
        }while(i <= 20);
    }

    public static void main(String[] args)
    {
        Odd();
        Even();
    }
}
