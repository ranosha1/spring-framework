package dish;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {




        //print all the dish name that has less than 400 calories
        System.out.println("************************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println("************************************");
        //print the length of the dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("************************************");
        //print high calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("************************************");

        //print all the dishes high 400 and sotr
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>400)
                .sorted(comparing(Dish::getCalories))
                //revering
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("************************************");
        System.out.println("Reversed method");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);


    }
}
