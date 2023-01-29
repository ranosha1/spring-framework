package collec;

import java.util.*;
import java.util.List;

public class Review {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tom"));
        students.add(new Student(2, "Yom"));
        students.add(new Student(3, "Bom"));
        students.add(new Student(4, "Hom"));
        students.add(new Student(5, "Lom"));

        System.out.println(students);

        System.out.println("FOR LOOP RESULTS");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students);
        }
        System.out.println("Iterator RESULTS");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Iterator BACKWARD RESULTS");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        System.out.println("FOR EACH RESULTS");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("LAMBDA RESULTS");
        students.forEach(student -> System.out.println(students));

        System.out.println("ORDER RESULTS");
        Collections.sort(students, new orderDescId());
        System.out.println(students);

        System.out.println("ORDER NAME RESULTS");
        Collections.sort(students,new orderName());
        System.out.println(students);

    }


    static class orderDescId implements Comparator<Student>{
        @Override
        public int compare (collec.Student o1, collec.Student o2){
        return o2.id - o1.id;
    }


    }

    static class orderName implements Comparator<Student>{

        @Override
        public int compare(collec.Student o1, collec.Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }


}
