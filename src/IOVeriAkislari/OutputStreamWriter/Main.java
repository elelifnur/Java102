package IOVeriAkislari.OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args){
        String data = "ĞÜŞİ";
        try {
            FileOutputStream fileOutput = new FileOutputStream("output.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);

            System.out.println(fileWriter.getEncoding());
            fileWriter.write(data);

            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
