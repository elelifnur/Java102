package IOVeriAkislari.FileOutputStream;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String yazi = "\noutputStream öğreniyırum. \nPatika dev";
        try {
            File dosya = new File("patika.txt");
            FileOutputStream output = new FileOutputStream(dosya, false);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
