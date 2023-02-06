package newPractice;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {

        List<Animal> animalList=new ArrayList<>();
        animalList.add(Animal.builder().cowMilk(16).cow("BROWN").build());
        animalList.add(Animal.builder().cowMilk(14).cow("Black").build());
        animalList.add(Animal.builder().cowMilk(17).cow("Yellow").build());
        animalList.add(Animal.builder().cowMilk(12).cow("Orange").build());
        System.out.println(animalList);


        //interface name  name= implementation of the abstract class method
        AnimalPredicate simple=(animal)->animal.getCowMilk()>15;

        //list and class name from lambda
        order(animalList,simple);
        System.out.println("++++++++++++++++++++++++=====");

//        AnimalPredicate simple1=animal -> animal.getCow().equals(Color.BROWN);
//        color1(animalList,simple1);







    }

    public static void order(List<Animal> animalList, AnimalPredicate animalPredicate){
        for (Animal animal : animalList){

            Boolean outlet=animalPredicate.cowMilk(animal);
            System.out.println(outlet);
        }
    }


    public static void color1(List<Animal> animalList, AnimalPredicate animalPredicate){
        for (Animal animal : animalList){
            boolean outlet=animalPredicate.cowMilk(animal);
            System.out.println(outlet);
        }
    }

}
