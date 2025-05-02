class Cube  
{
    public int volume(int side) 
    {
        return side * side * side;
    }
    
    public int volume(int length, int width, int height) 
    {
        return length * width * height;
    }

    public static void main(String[] args) 
    {
        Cube ans = new Cube();
        System.out.println("Volume of cube: " + ans.volume(3));
        System.out.println("Volume of cuboid: " + ans.volume(3, 4, 5));
    }
}
