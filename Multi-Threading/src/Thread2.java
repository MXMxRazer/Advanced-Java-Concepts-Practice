public class Thread2 implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("THREAD 2!");
        } catch (Exception e)
        {
            System.out.println("EXCEPTION CAUGHT IN THREAD 2!");
        }
    }

}
