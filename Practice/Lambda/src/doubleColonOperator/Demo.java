package doubleColonOperator;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

    //when we write the lambda expression first we call the Interface type
        // right side implementation of the abstract method of interface
        //calling the statis method putting out class name
        Calculate s1=(x,y)->Calculator.adding(x,y);
        s1.Calculate(12,15);



        //Reference to instance method
        Calculate m1=(x,y)->new Calculator().multiply(x,y);
        m1.Calculate(3,7);


        Calculator obj=new Calculator();
        Calculate m2=obj::multiply;
        m2.Calculate(5,6);

        Calculate m3=new Calculator()::multiply;
        m3.Calculate(12,2);

        BiFunction<String,Integer,String> fn=(str, i)->str.substring(6);
        System.out.println(fn.apply("Developer ", 5));

        BiFunction<String,Integer,String> fn2=String::substring;
        System.out.println(fn.apply("Developer",4));


        Consumer<Integer> display=i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display1= System.out::println;
        display1.accept(12);








    }
}
