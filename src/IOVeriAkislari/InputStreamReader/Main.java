package IOVeriAkislari.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");

            InputStreamReader inputReader = new InputStreamReader(fileInput);
            System.out.println(inputReader.getEncoding());

            int i = inputReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = inputReader.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
