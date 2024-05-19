import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {

        BufferOperation bufferOp = new BufferOperation("C:\\Users\\varkr\\OneDrive\\Desktop\\Codes\\Advanced Java\\InputOutputOperations\\src\\text.txt");

        bufferOp.readFile();
    }
}