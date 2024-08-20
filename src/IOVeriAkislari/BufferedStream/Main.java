package IOVeriAkislari.BufferedStream;
import java.io.*;

public class Main {
    public static void main(String[] args){
        String data = "Java 102 patikası";
        try {
            FileOutputStream file = new FileOutputStream("patika.txt");
            BufferedOutputStream buffFile = new BufferedOutputStream(file);

            byte[] byteArray = data.getBytes();

            buffFile.write(byteArray);
            buffFile.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*try {
            FileInputStream fileInput = new FileInputStream("patika.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            int i = buffInput.read();
            while(i != -1){
                System.out.print((char) i);
                i = buffInput.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
