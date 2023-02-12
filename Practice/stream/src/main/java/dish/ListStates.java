package dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListStates {

    public static void main(String[] args) {


        State VA=new State();
        VA.addCity("Mclean");
        VA.addCity("Tyson");
        VA.addCity("Aldie");
        VA.addCity("Fairfax");

        State TX=new State();
        TX.addCity("Dallas");
        TX.addCity("Austin");
        TX.addCity("Plano");
        TX.addCity("Houston");

        List<State> list=Arrays.asList(VA,TX);

//        list.stream()
//                .map(state -> state.getCity())
//                .forEach(System.out::println);

        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);
    }


}
