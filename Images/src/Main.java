import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        System.out.println("IMAGE HANDLER\n");

        int width = 1080;
        int height = 720;

        BufferedImage image = null;

        BufferedImage imageReturned = readImage(width, height, image);

        System.out.println("Image: " + imageReturned);

        String imageName = "wroteImage.png";
        String location = String.format("C:\\Users\\varkr\\OneDrive\\Desktop\\Codes\\Advanced Java\\%s", imageName);

        String imageWriting = writeImage(imageReturned, location);

        System.out.println("IMAGE WRITING STATUS: " + imageWriting);

    }

    public static BufferedImage readImage(int width, int height, BufferedImage image)  {

        String imageLocation = "https://c4.wallpaperflare.com/wallpaper/108/140/869/digital-digital-art-artwork-fantasy-art-drawing-hd-wallpaper-thumb.jpg";

        try {
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(new URL(imageLocation));
        } catch (IOException ex) {
            System.out.println("IO EXCEPTION CAUGHT: " + ex.getMessage());
        } finally {
            System.out.println("------ IMAGE READING COMPLETE ---------");
        }

        return image;
    }

    public static String writeImage(BufferedImage image, String location) {
        try {
            boolean result = ImageIO.write(image, "png", new File(location));

            if (!result) {
                return "failed!";
            }
        } catch(IOException ex) {
            System.out.println("IO EXCEPTION CAUGHT: " + ex.getMessage());
        } finally {
            System.out.println("------ IMAGE WRITING COMPLETE ---------");
        }

        return "success!";
    }
}