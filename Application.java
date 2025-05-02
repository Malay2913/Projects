class DownloadFileTask implements Runnable 
{
    private final int fileNumber;

    public DownloadFileTask(int fileNumber) 
    {
        this.fileNumber = fileNumber;
    }

    @Override
    public void run() 
    {
        System.out.println("Starting download of file " + fileNumber);
        try 
        {
            Thread.sleep(1000) ;
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("File Successfully Downloaded " + fileNumber);
    }
}

public class Application
{
    public static void main(String[] args) 
    {
        int[] files = {1, 2, 3, 4, 5};
        for (int file : files) 
        {
            new Thread(new DownloadFileTask(file)).start();
        }
    }
}
