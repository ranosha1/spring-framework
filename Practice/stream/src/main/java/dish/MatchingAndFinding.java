package dish;

import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        //all match
        System.out.println("===ALL MATCH METHODS====");
       boolean isHealthy= DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        //any match
        System.out.println("=====ANY MATCH METHODS======");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
        System.out.println("Menu is vegetarian friendly");


        //NONE match
        System.out.println("=====NONE MATCH METHODS======");
        boolean isHealthy1=DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=100);
        System.out.println(isHealthy1);


        //FIND ANY
        System.out.println("=====FIND ANY METHODS======");
        Optional<Dish> dish= DishData.getAll().stream().
                filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());


        //find first
        System.out.println("=====FIND FIRST METHODS======");
        Optional<Dish> dish2= DishData.getAll().stream().
                filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());

    }




}
