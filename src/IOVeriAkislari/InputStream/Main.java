package IOVeriAkislari.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        try {
           // File dosya = new File("patika.txt");
            FileInputStream input = new FileInputStream("src/IOVeriAkislari/InputStream/patika.txt");
            /*System.out.println("Kullanılabilir byte sayısı : "+ input.available());
            input.read();
            input.read();
            input.read();
            input.read();
            System.out.println("Kullanılabilir byte sayısı : "+ input.available());*/
            input.skip(10);
            int i = input.read();
            while(i != -1){
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
