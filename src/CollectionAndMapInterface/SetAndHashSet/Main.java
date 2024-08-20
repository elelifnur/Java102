package CollectionAndMapInterface.SetAndHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(null);

        //hSet.remove(10);
        //hSet.clear();

        // Hashlere göre sıralama yaptığı için çıktısı 20 10 30 oluyor.
        /*for (Integer sayi : hSet){
            System.out.println(sayi);
        }*/

        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
