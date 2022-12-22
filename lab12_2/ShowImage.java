package lab12_2;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class ShowImage extends Panel {
    BufferedImage image;

    public ShowImage() {
        try {
            String imageName = "C:\\Users\\kim_d\\Pictures\\Saved Pictures\\1.jpg";
            File filename = new File(imageName);
            image = ImageIO.read(filename);
        } catch (IOException ie) {
            System.out.println("Error:" + ie.getMessage());
        }
    }

    public void paint(Graphics g) {
        g.drawImage(image, 40, 0, null);
    }
}