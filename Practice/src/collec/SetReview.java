package collec;

import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {


        Set<Student> mySet = new HashSet<>();

        mySet.add(new Student(7, "Tonny"));
        mySet.add(new Student(8, "Tob"));
        mySet.add(new Student(9, "Toby"));
        mySet.add(new Student(9, "Toby"));

        System.out.println(mySet);

        Set<Integer> myNums = new HashSet<>();
        myNums.add(1);
        myNums.add(2);
        System.out.println(myNums);
        System.out.println(myNums.add(2));

        System.out.println("First Repeating word: "+ firstRepeating("Java developer"));


    }

    // create a method
    public static Character firstRepeating(String str) {

        //create a hashset
        Set<Character> chars = new HashSet<>();
        // Iteration
        for (Character ch : str.toCharArray())
            if (!chars.add(ch)) {
                return ch;
            }
            return null;
        }

    }


