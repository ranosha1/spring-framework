package Collections;

import practice.Student;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Beckham"));
        students.add(new Student(2, "Rani"));
        students.add(new Student(3, "Tom"));
        students.add(new Student(4, "Jose"));
        System.out.println(students);
        // for loop
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));


        //Iterator
        System.out.println("Iterator class--------------------");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Iterator Backward class--------------------");
        //backward iteraotr
        //  Iterator iters=student.listIterator();
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
            System.out.println("Foe each class--------------------");
            for (Student student : students)
                System.out.println(student);

            System.out.println("Pring with Lambda--------------------");
            students.forEach(student -> System.out.println(student));


            System.out.println("Sorting clas--------------------");
            Collections.sort(students, new sortByDesc());
            System.out.println(students);
            Collections.sort(students, new sortByName());
            System.out.println(students);


        }


    static class sortByDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    static class sortByName implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }

    }

    public static class MapREview {
        public static void main(String[] args) {

            Map<Integer, String> mp = new HashMap<>();
            mp.put(1, "Jane");
            mp.put(2, "Janev");
            System.out.println(mp.get(2));


        }

    }
}










