import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  { 
    Scanner obj = new Scanner(System.in);
    System.out.print("How many line you Want: ");
    int count = obj.nextInt();
    int i,j;
    
    for(i=0;i<count;i++)
    {
    
      for(j=count-i;j>1;j--)
      {
        System.out.print(" ");
      }

      for(j=0;j<=i;j++)
      {
        System.out.print("* ");
      }
      
      System.out.println();
    }
  } 
}