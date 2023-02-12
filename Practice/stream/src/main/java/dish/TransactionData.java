package dish;

import java.util.Arrays;
import java.util.List;

public class TransactionData {


    public static List<Transaction> getAll(){
        Trader tom=new Trader("Tom","Milan");
        Trader Jon=new Trader("Jon","Milan");
        Trader bob=new Trader("Bob","Cambridge");
        Trader ron=new Trader("Ron","Cambridge");
        return Arrays.asList(
                new Transaction(tom,2011,200),
                new Transaction(Jon,2011,300),
                new Transaction(bob,2013,400),
                new Transaction(ron,2015,600)
        );








    }

}
