import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers");
        for(int i = 0 ; i < 10; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = obj.nextInt();
            sum += arr[i];
        }
        float average = sum/10.0f;
        
        System.out.println("Sum of 10 number is: " + sum);
        System.out.println("Average of 10 number is: " + average);    
    }


}