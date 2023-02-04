package functionalInterface;

import java.util.function.*;

public class Example {
    public static void main(String[] args) {


        //=====Predicate======//
//        Predicate<Integer> lesserThan=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };



        Predicate<Integer> lesserThan=b->b<56; //Implementation of test method that belongs to Predicate interface
        Boolean result=lesserThan.test(150);
        System.out.println(result);

        //=====CONSUMER======//

        Consumer<Integer> display=i-> System.out.println(i);
        display.accept(50);

        //=====BICONSUMER======//
        BiConsumer<Integer,Integer> addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(10,20);

        //=====Function======//
        Function<String,String> fun=s->"Hello "+ s;
        String str=fun.apply("Amin");
        System.out.println(str);

        //=====SUPPLIER======//
        Supplier<Double> random=()->Math.random();
        double ran=random.get();
        System.out.println(ran);


    }

}
