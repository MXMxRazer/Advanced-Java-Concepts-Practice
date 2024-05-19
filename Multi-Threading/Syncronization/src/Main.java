public class Main {
    public static void main(String[] args)
    {
        Run run = new Run();

        Thread1 t1 = new Thread1(run);
        Thread t2 = new Thread(new Thread2(run));

        t1.start();
        t2.start();

    }
}