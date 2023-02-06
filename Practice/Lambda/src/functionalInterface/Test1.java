package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {

    public static void main(String[] args) {

    //print all elements in the list
        List<User> list1=new ArrayList<>();
        list1.add(User.builder().userName("Ton").lastName("Elom").age(22).build());
        list1.add(User.builder().userName("Tob").lastName("Hop").age(23).build());
        list1.add(User.builder().userName("Bob").lastName("Pop").age(24).build());
        list1.add(User.builder().userName("Car").lastName("Nop").age(25).build());

    //    System.out.println(list1);

         printName(list1,p->true);


        System.out.println("++++++++++++++++++++++++");

        //print all users last name starts with E

        printName(list1,p->p.getLastName().startsWith("E"));







    }

    private static void printName(List<User> list1, Predicate<User> p){
        for (User user:list1){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
             {

        }
    }

}
