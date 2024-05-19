import java.lang.reflect.Constructor;

public class Thread2 implements Runnable
{

    private Run run = null;
    Thread2(Run run)
    {
        this.run = run;
    }

    @Override
    public void run()
    {
        try
        {
            run.getSquares(3);
        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION CAUGHT!");
        }
    }

}
