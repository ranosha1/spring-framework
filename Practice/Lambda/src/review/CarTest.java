package review;

import task1.Orange;
import task1.OrangeFormater;
import task2.Apple;
import task2.Color;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {

        List<Car> listCar=new ArrayList<>();
        listCar.add(new Car("BMW",12));
        listCar.add(Car.builder().model("Honda").make(2020).build());
        listCar.add(Car.builder().model("Toyota").make(2021).build());
        listCar.add(Car.builder().model("Toyota1").make(2022).build());
        listCar.add(Car.builder().model("Toyota2").make(2020).build());

        System.out.println(listCar);

       CarFastPredicate car1=new CarFastPredicate();
      //  car1.fastCar(car1);
        prettyPrintCar(listCar,car1);
        System.out.println("++++++++++++++++++");
        CarPredicate simpleFormatter = car -> car.getMake()>2020;


        prettyPrintCar(listCar,simpleFormatter);


       // System.out.println(simpleFormatter);

        System.out.println("++++++++++++++++++");













    }

    private static void prettyPrintCar (List <Car> listCar, CarPredicate carPredicate){
        for (Car car : listCar) {
            Boolean output = carPredicate.fastCar(car);
            System.out.println(output);


        }}

}
