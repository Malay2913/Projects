import java.util.Scanner;
public class prime 
{
        public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();
        int a = 0;

        if (n <= 1)
        {
            a = 1; 
        } 
        else 
        {
            for (int i = 2; i < n; i++) 
            {
                if (n % i == 0) 
                {
                    a = 1;
                }
            }
        }

        if (a == 0) 
        {
            System.out.println("Prime number");
        } 
        else 
        {
            System.out.println("Not a prime number");
        }
    }
}