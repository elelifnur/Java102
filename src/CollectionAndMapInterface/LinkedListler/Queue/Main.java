package CollectionAndMapInterface.LinkedListler.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){

        // Polimorfizm, polimorphism, çok biçimlilik
        Queue<String> q = new LinkedList<>();
        q.add("Elif");
        q.add("Akın");
        q.offer("ilkay");

        //q.remove(); değer girilmezse en baştaki elemanı siler yani elifi
        //q.remove("ilkay");

        //System.out.println(q.element());
        //System.out.println(q.poll());
        System.out.println(q.peek());

        Iterator<String> itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
