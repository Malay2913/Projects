interface Shape 
{
    void draw();
} 

interface Color
{
    void red();
}

class display implements Shape, Color
{
    public void draw()
    {
        System.out.println("Drawing cicrle");
    }
    public void red()
    {
        System.out.println("This is red color");
    }
    public static void main(String[] args)
    {
        display obj = new display();
        obj.draw();
        obj.red();
    }
}