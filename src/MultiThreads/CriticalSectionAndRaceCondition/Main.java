package MultiThreads.CriticalSectionAndRaceCondition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic =new OrderMatic();
        List<Thread> islemler = new ArrayList<>();
        for(int i=0; i < 100; i++){
            Thread t = new Thread(oMatic);
            islemler.add(t);
            t.start();
        }

        for(Thread t : islemler){
            t.join();
        }



        /*Thread t1 = new Thread(oMatic);
        t1.start();
        t1.join();

        Thread t2 = new Thread(oMatic);
        t2.start();
        t2.join();*/

        System.out.println(oMatic.getOrderNo());
    }
}
