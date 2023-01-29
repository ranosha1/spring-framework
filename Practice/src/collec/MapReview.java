package collec;

import java.util.HashMap;
import java.util.*;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer, String> map= new HashMap<>();
        map.put(1,"Ton");
        map.put(2,"Tony");
        map.put(3,"Toni");
        System.out.println(map.get(1));


        System.out.println("Non repeating value " + findFirstNonRepeating("My development"));

    }

    public static Character findFirstNonRepeating(String str) {

        Map<Character,Integer> map = new HashMap<>();
        //counting the chars
        int count;
        //counting the chars and putting in the hash map
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else map.put(ch, 1);
        }


        //starting from string, check if the char counts equals 1
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }return Character.MIN_VALUE;
    }
}
