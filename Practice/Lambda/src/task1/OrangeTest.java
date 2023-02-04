package task1;



import java.util.*;

public class OrangeTest {

    public static void main(String[] args) {


        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(Orange.builder().weight(100).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(400).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.GREEN).build());

        OrangeFormater simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
        // prettyPrintApple(inventory,simpleFormatter);

        prettyPrintApple(inventory, orange -> " An orange of " + orange.getWeight() + "g");

        //when we have the logic we need to use {} and we need return type
        OrangeFormater fancyFormater = orange -> {
            String charecters = orange.getWeight() > 120 ? "Heavy " : " Light";
            return "A " + charecters + "" + orange.getColor() + " orange";};


        prettyPrintApple(inventory,fancyFormater);


    }


        private static void prettyPrintApple (List < Orange > inventory, OrangeFormater orangeFormater){
            for (Orange orange : inventory) {
                String output = orangeFormater.accept(orange);
                System.out.println(output);
            }
        }


    }

