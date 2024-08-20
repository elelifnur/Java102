package CollectionAndMapInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args ){
       /* List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(5);
        liste.add(null);
        liste.add(1);*/

        List<String> liste = new ArrayList<>();
        liste.add("İstanbul");
        liste.add("Ankara");
        liste.add("İzmir");
        liste.add("Bursa");
        liste.add("Eskişehir");
        liste.clear();
        System.out.println(liste);

        /*Object[] abjectArr = liste.toArray();
        String[] str = liste.toArray(new String[0]);
        System.out.println(str[0]);*/

        //List<String> liste2 = new ArrayList<>();
        /*liste2.add("Manisa");
        liste2.addAll(0,liste);
        System.out.println(liste2);*/

       /* List<String> liste2 = liste.subList(2,5);
        System.out.println(liste2);*/

        //System.out.println(liste.remove(3));
        //liste.add(2, 15); 2. indise 15 sayısını ekler

        /*for(String element : liste){
            System.out.println(element);
        }*/
    }
}
