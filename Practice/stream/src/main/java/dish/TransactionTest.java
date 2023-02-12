package dish;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {


        // find all transaction in 2011 and sort by values
        System.out.println("********Task 1**************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2- what are all the unique cities where traders work
        System.out.println("********Task 2**************");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3 find all the traders from cambridge and sort them by name
        System.out.println("********Task 3**************");
        TransactionData.getAll().stream()
                .map(Transaction ::getTrader)
                .filter(trader->trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);


        //4 return a string of all traders names sorted alphabetically
        System.out.println("********Task 4**************");
       String result= TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2)-> name1+name2 + " ");
        System.out.println(result);

        //5 are any trades based in milan
        System.out.println("********Task 5**************");
        boolean milanbased=TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanbased);

        //6 print the values of all transactions from the  trades living in cambridge
        System.out.println("********Task 6**************");
        TransactionData.getAll().stream()
                .filter(transaction->transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7 what is the highest value of all the transaction
        System.out.println("********Task 7**************");
      Optional<Integer> high= TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(high.get());

        // 8 find the transaction with the smallest value
        System.out.println("********Task 8**************");
        Optional<Transaction> small= TransactionData.getAll().stream()
                .reduce((t1,t2)->t1.getValue()< t2.getValue()? t1:t2);
        System.out.println(small.get());

        Optional<Transaction> small1= TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(small1);
    }}

