public class Thread1 extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("THREAD 1!");
        } catch (Exception e)
        {
            System.out.println("EXCEPTION CAUGHT IN THREAD 1!");
        }
    }

}
