import java.util.Scanner;
public class Passfail
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = obj.nextInt();
        if(marks>=50)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}