package IOVeriAkislari.PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        String data = "Java 102";
        try {
            PrintWriter writer = new PrintWriter("output.txt");
            writer.print(data);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
