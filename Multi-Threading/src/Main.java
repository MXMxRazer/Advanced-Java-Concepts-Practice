public class Main {
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            Thread1 t1 = new Thread1();
            t1.start();

            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}