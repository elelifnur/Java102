package IOVeriAkislari.ByteArrayStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] srgs){
        String data = "Java 102 Dersleri!";
        ByteArrayOutputStream output= new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Çıkış akışı : "+ newData);
        } catch (IOException e) {
            e.printStackTrace();
        }



        // byte[] dizi = {1,2,3,54,66, 6, 12, 3};
        //ByteArrayInputStream input = new ByteArrayInputStream(dizi, 2, 4);
        //ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        /*System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());*/

       // System.out.println("Kullanılan byt sayısı : " + input.available());
        //input.skip(2);
        /*int i = input.read();
        while (i != -1) {
            System.out.println(i);
            i = input.read();
        }

        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
