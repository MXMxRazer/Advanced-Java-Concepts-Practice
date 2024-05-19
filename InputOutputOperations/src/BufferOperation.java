import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOperation {

    private String fileLocation;

    BufferOperation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void readFile() throws IOException {

        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(this.fileLocation);

            int content = 0;

            while((content = fileInput.read()) != -1) {
                System.out.print((char) content);
            }

            fileInput.close();
        } catch (RuntimeException e) {
            System.out.println("RUNTIME EXCEPTION CAUGHT!");
        }

    }

}
