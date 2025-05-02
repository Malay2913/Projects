import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number to print the Fibonacciseries: ");
        int n = obj.nextInt(); 
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}