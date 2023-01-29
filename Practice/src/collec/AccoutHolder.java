package collec;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class AccoutHolder {
    public static void main(String[] args) {

        List<Bank> banks = new ArrayList<>();
        banks.add(new Bank("PNC", 123));
        banks.add(new Bank("ATT", 456));
        banks.add(new Bank("VR", 789));
        banks.add(new Bank("SAT", 987));

        System.out.println(banks);
        System.out.println("Backward");
        Iterator iter= banks.listIterator();
        while (((ListIterator<?>)iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }




        Collections.sort(banks, new orderAccount());
        System.out.println(banks);


        Collections.sort(banks, new orderBank());
        System.out.println(banks);

    }

    static class orderAccount implements Comparator<Bank>{
        @Override
        public int compare (Bank o1, Bank o2){
            return o2.account - o1.account;}
        }

    public static class orderBank implements Comparator<Bank>{

        @Override
        public int compare(Bank o1, Bank o2) {
            return o2.bank.compareToIgnoreCase(o1.bank);
        }
    }


        }
