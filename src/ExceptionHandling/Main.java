package ExceptionHandling;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("yaşınız tutmuyor");
        }
        System.out.println("Yaşı uygundur");
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        try{
            checkAge(age);

        }catch (Exception e){
            System.out.println("Yaşı uymadı!");
        }
        System.out.println("Proegram bitti!");
    }
}
