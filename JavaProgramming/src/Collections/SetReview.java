package Collections;

import practice.Student;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {


        Set<Student> mySet = new HashSet<>();

        mySet.add(new Student(7, "Rano"));
        mySet.add(new Student(8, "Bob"));
        mySet.add(new Student(9, "Tom"));
        mySet.add(new Student(9, "Tom"));

        System.out.println(mySet);

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        System.out.println(nums);
        System.out.println(nums.add(2));
        System.out.println("First time :" +firstChar("java develooper"));

    }

        public static Character firstChar(String str){

            Set<Character> chars= new HashSet<>();

            for (Character ch:str.toCharArray())
                if(!chars.add(ch)) return ch;
            return null;



        }

        }
