import java.util.Scanner;
public class student
{
    Scanner obj= new Scanner(System.in);
    Scanner Subject=new Scanner(System.in);
    String name;

    public student()
    {
        System.out.print("Enter your name: ");
        name = obj.nextLine();
    }
}
class age extends student
{
    int age;
   
    public age()
    {
        super();
        System.out.print("Enter your age: ");
        age = obj.nextInt();
    }
}
class sub extends age
{ 
    String subj;
    public sub()
    {
        super();
        System.out.print("Enter Subject: ");
        subj =Subject.nextLine();
    }
}
class rollno extends sub
{
    int rollno;
    
    public rollno()
    {
        super();
        System.out.print("Enter your rollno: ");
        rollno = obj.nextInt();
        System.out.println("");

    }
} 
class show extends rollno
{
    public show()
    {
        super();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Subject: "+subj);
        System.out.println("Rollno: "+rollno);
        
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        show s = new show();
    }
}