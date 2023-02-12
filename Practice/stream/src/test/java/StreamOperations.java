import java.util.*;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList= Arrays.asList(1,2,4,5,6,7,8,9);
        //we can do this way and use the short way with ::
        myList.forEach(x-> System.out.println(x));
        //calling with :: method
        myList.forEach(System.out::println);


        //FILTER
        System.out.println("Filter");
        myList.stream()
                .filter(i -> i%3==0)
                .distinct().
                forEach (System.out::print);

        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("SKIPPING");
        myList.stream()
                .filter(i-> i%2==0 )
                .skip(2)
                .forEach(System.out::println);

        System.out.println("Mappppp");
                                   myList.stream()
                                           .filter(i-> i%2==0)
                                           .map(i-> i*3) .forEach(System.out::println);
        System.out.println("==========Getting the length of the each words in array========");
       List<String> words=Arrays.asList("Java", "Apple","Honda","Developer");

       String x="Java";
        System.out.println(x.length());

       words.stream()

               //.map(w->w.length())
               //we can simplify by double colon operation
               .map(String::length)

               .forEach(System.out::println);
                                   {
            
        }






    }
}
