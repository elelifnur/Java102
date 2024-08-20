package NestedAndGeneric;

// OUTER CLASS
public class Out {
    public int a = 5;

    public class In{
        public int a = 10;

        // INNER CLASS
        public void run(){
            System.out.println("in sınıfına ait run metou ");
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }

    public void run(){

        In in = new In();
        in.run();
    }
}
