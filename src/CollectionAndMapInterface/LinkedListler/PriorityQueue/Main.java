package CollectionAndMapInterface.LinkedListler.PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());

        q.add("Elif");
        q.add("Akın");
        q.add("İlkay");

        Iterator<String> itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //System.out.println(q.poll());

        /*for(String str : q){
            System.out.println(str);
        }*/
    }
}
