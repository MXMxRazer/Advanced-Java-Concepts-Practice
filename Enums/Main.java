public class Main
{

    public static void main(String[] args)
    {
        Color c = Color.RED;

        System.out.println("NAME OF COLOR.RED: " + c.name());
        System.out.println("VALUE OF COLOR.RED: " + c.getValue());

        for (Color color: Color.values()) {
            System.out.println(color.getValue());
        }
    }

}
