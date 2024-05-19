public class Print<T> {

    private final T obj;

    Print(T obj) {
        this.obj = obj;

        System.out.println(obj);
        System.out.println(obj.getClass());
    }

}
