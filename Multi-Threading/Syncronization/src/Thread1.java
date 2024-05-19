import java.lang.reflect.Constructor;

public class Thread1 extends Thread
{

    private Run run = null;
    Thread1(Run run)
    {
        this.run = run;
    }

    @Override
    public void run()
    {
        try
        {
            run.getSquares(2);
        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION CAUGHT!");
        }
    }

}
