public class Run
{
    public void getSquares(int x)
    {
        synchronized (this) {
            for (int i = 0; i < 4; i++) {
                System.out.println(Math.pow(x, 2));
                try {
                    Thread.sleep(600);
                } catch (Exception e) {
                    System.out.println("EXCEPTION IN LOOP!");
                }
            }
        }
    }

}
