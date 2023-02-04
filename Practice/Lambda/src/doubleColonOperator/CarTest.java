package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //zero arg
        Supplier<Car> c1=()->new Car();
        System.out.println(c1.get().getModel());

        //when we are calling constructor  class:: new
        Supplier<Car> c2=Car::new;
        System.out.println(c2.get().getModel());


        //one arg

        Function<Integer,Car> f1=model->new Car(model);
        Car bmw=f1.apply(2020);
        System.out.println(bmw.getModel());

        Function<Integer,Car> f2=Car::new;
        Car bmw2=f2.apply(2121);
        System.out.println(bmw2.getModel());


        // two arg
        BiFunction<String,Integer,Car> n=(make,model)->new Car(make,model);
        Car b=n.apply("Honda",2020);
        System.out.println(b.getMake()+ " " +b.getModel());

        BiFunction<String,Integer,Car> n1=Car::new;
        Car n2=n1.apply("BMW",2020);
        System.out.println(n2.getMake() + " "+n2.getModel());




    }


}
