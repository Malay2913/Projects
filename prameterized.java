class Parameterized 
{
    int x, y;

    Parameterized(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    Parameterized() 
    {
        this(10, 20);
    }

    void display() 
    {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) 
    {
        Parameterized obj1 = new Parameterized(30, 40);
        Parameterized obj2 = new Parameterized();

        obj1.display();
        obj2.display();
    }
}
