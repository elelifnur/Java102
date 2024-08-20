package IOVeriAkislari;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dizin = new File("patika");
        String[] liste = dizin.list();

        for(String str : liste){
            System.out.println(str);
        }

        /*File dizin = new File("patika/dev");
        System.out.println(dizin.mkdirs());*/
        //File dosya = new File("src/IOVeriAkislari/patika.txt");
        /*try {
            if (dosya.createNewFile()){
                System.out.println(dosya.getName() + " dosyası oluşturuldu.");
            }else{
                System.out.println(dosya.getName() + " dosyası zaten mevcut");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        //dosya.delete();
    }

}
