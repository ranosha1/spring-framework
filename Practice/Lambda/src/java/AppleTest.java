package java;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inv=new ArrayList<>();
        inv.add(new Apple(200, Color.GREEN));
        inv.add(new Apple(300, Color.RED));
        inv.add(new Apple(100, Color.GREEN));
        inv.add(new Apple(500, Color.RED));
        inv.add(new Apple(450, Color.GREEN));

        List<Apple> heavyApple=filterApples(inv, new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple=filterApples(inv, new AppleGreenColorPredicate());
        System.out.println(greenApple);
    }

    private static List<Apple> filterApples(List<Apple> inv, ApplePredicate applePredicate) {

        List<Apple> result= new ArrayList<>();

        for(Apple apple:inv){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
