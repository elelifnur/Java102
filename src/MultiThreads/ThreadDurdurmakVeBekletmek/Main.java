package MultiThreads.ThreadDurdurmakVeBekletmek;

public class Main {
    public static void main(String[] args){
        //Thread t1 = new Thread(new Counter("c1",1));
       // t1.start();
        Counter c1 = new Counter("c1", 1);
        Thread t1 = new Thread(c1);
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        c1.stop();

        Counter c2 = new Counter("c2",2);
        Thread t2 = new Thread(c2);


        //Thread t2 = new Thread(new Counter("c2",2));
        //t2.start();

    }
}
