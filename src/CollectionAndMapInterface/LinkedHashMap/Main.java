package CollectionAndMapInterface.LinkedHashMap;

import CollectionAndMapInterface.TreeSet.OrderNameComparator;
import CollectionAndMapInterface.TreeSet.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        TreeMap<Integer, Student> students = new TreeMap<>(new OrderByComparator().reversed());

        students.put(102, new Student(102, "Elif", 100));
        students.put(110, new Student(110, "İlkay", 100));
        students.put(108, new Student(108, "İlker", 100));
        students.put(118, new Student(118, "Merve", 100));

        for( Student stu : students.values()){
            System.out.println(stu.getName());
        }
    }
}
