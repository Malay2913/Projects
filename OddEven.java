import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = obj.nextInt();
        if(number % 2==0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is Odd");
        }
    }
}