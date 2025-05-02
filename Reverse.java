public class Reverse 
{
    public static void main(String[] args) 
    {
       int num = 12345;
       String nums = Integer.toString(num);
       char [] arr = nums.toCharArray();
       System.out.print("Reversed digits: ");
       for(int i = arr.length-1; i>=0; i--)
       {
           System.out.print(arr[i]);
       }
     }
}