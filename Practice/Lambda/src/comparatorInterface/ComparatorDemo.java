package comparatorInterface;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {


        List<Integer> list=Arrays.asList(10,20,45,87,25);

        //acs order
        Collections.sort(list);
        System.out.println(list);

        //desc order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1,o2)->(o1>o2) ? -1 : (o2<o1) ? 1: 0));

        //acs order
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
        // desc
        list.sort((o1,o2)->o2.compareTo(o1));
        System.out.println(list);

   List<Apple> myInventory=Arrays.asList(
        new Apple(12,Color.RED),
           new Apple(13,Color.RED),
           new Apple(14,Color.GREEN));

   Comparator<Apple> sortApple= comparing(apple -> apple.getWeight());
   myInventory.sort(sortApple);
   System.out.println(myInventory);

   myInventory.sort(comparing(apple -> apple.getWeight()));
   myInventory.sort(comparing(Apple::getWeight));

   //reverse

        myInventory.sort(comparing(Apple::getWeight).reversed());

        //chaining
        myInventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));




    }
}
