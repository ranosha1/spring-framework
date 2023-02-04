package functionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users=new ArrayList<>();
        users.add(User.builder().userName("Tom").lastName("Bob").age(15).build());
        users.add(User.builder().userName("Tom").lastName("Evan").age(15).build());
        users.add(User.builder().userName("Tok").lastName("Bob").age(15).build());
        users.add(User.builder().userName("Toom").lastName("Bob").age(15).build());

        //print all elements in the list
     //   studentName(users,p-> true);

        //print all users that last name starts with e
        studentName(users, user->user.getLastName().startsWith("E"));





    }

    //check the all the user and run
    public static void studentName(List<User> users, Predicate<User> p){
        for(User user: users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
