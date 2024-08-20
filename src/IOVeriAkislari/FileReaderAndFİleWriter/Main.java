package IOVeriAkislari.FileReaderAndFİleWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        String data = "JAVA ÖĞRENİYORUM ";

        try {
            FileWriter writeFile = new FileWriter("output.txt");
            writeFile.write(data);
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            FileReader readFile = new FileReader("patika.txt");
            //readFile.skip(1);
            int i = readFile.read();
            while(i != -1){
                System.out.print((char) i);
                i = readFile.read();
            }
            readFile.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }
}
