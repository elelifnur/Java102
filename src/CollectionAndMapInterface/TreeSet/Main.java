package CollectionAndMapInterface.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());

        students.add(new Student(102,"Elif", 50));
        students.add(new Student(110,"İlkay", 100));
        students.add(new Student(108,"Merve", 45));
        students.add(new Student(118,"İlker", 80));

        for(Student stu : students){
            System.out.println(stu.getName());
        }
    }
}
