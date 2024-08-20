package IOVeriAkislari.BufferedReaderANdBufferedWriter;

import java.io.*;

public class Main {
    public static void main(String[] args){
        String data = "JAVAÖĞRENİYORUM";
        File dosya = new File("output.txt");

        try (FileWriter writeFile = new FileWriter(dosya);
             BufferedWriter writeBuff = new BufferedWriter(writeFile)){

            writeBuff.write(data);

        } catch (Exception e) {
            e.printStackTrace();
        }


       /* try {
            FileReader readFile = new FileReader("patika.txt");
            BufferedReader readBuff = new BufferedReader(readFile);

            *//*String line = readBuff.readLine();
            while (line != null){
                System.out.println(line);
                line = readBuff.readLine();

            }*//*

           *//* String line ;
            while(line = readBuff.readLine() != null ){
                System.out.println(line);

            }*//*
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
