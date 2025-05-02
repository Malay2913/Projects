class MarksOutOfBoundException extends Exception 
{
    public MarksOutOfBoundException() 
    {
        super("Marks entered are out of bound. They should be less than or equal to 100.");
    }
}

public class MarksChecker 
{
    public static void checkMarks(int marks) throws MarksOutOfBoundException 
    {
        if (marks > 100) 
        {
            throw new MarksOutOfBoundException();
        }
    }

    public static void main(String[] args)
    {
        try 
        {
            checkMarks(105);
        } catch (MarksOutOfBoundException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}