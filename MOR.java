class Parent 
{
    public void display() 
    {
        System.out.println("This is the display method of the Parent class.");
    }
}

class Child extends Parent 
{
    public void display() 
    {
        System.out.println("This is the display method of the Child class.");
    }
}

public class MOR 
{
    public static void main(String[] args) 
    {
        Parent parent = new Parent();
        parent.display(); 

        Child child = new Child();
        child.display(); 

        Parent parentRef = new Child();
        parentRef.display(); 
    }
}
