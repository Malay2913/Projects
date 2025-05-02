import java.util.Scanner;
public class Arthmetic 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("How many numbers you wanna enter: ");
        int a = obj.nextInt();
        double b = 0;

        for (int i = 0; i < a; i++) 
        {
            System.out.print("Enter a number: ");
            double number = obj.nextDouble();
            b+= number;
        }

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = obj.next().charAt(0);
        double result = 0;

        switch (operator) 
        {
            case '+':
                result = b;
                break;
            case '-':
                result = b - (2 * b); 
                break;
            case '*':
                result = b * b; 
                break;
            case '/':
                if (b != 0) {
                    result = b / a;
                } else {
                    System.out.println("Error! Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error! Operator is not correct");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
