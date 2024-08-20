package CollectionAndMapInterface.LinkedListler;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> liste = new LinkedList<>();
        liste.add("Elif");
        liste.add("Akın");
        liste.add("İlkay");
        liste.add("Acar");

        //liste.remove("Elif");


        Iterator<String> itr = liste.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for (String str : liste ){
            System.out.println(str);
        }
    }
}
