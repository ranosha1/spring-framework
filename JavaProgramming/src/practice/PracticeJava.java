package practice;

public class PracticeJava {

    public static void main(String[] args) {

        String word="Hello World!";
        System.out.println(word);

        //EscapeSequences
        System.out.println("New class \nToday");
        System.out.println("\t We love Java");
        System.out.println("Java is \\fun");
        System.out.println("I love \"Java\"");

      //implicit casting
        int a=12;
        int b=a;
        //explicit casting
        double c=12;
        int d = (int)c;

        //uniry operators4
      int w=12;
      w+=25;
      ++w;//adding 1
      w++;//adding 1
        System.out.println(w);

        int q=13;
        q-=3;
        --q;
        q--;
        System.out.println(q);

        System.out.println(q--);

        System.out.println(q);

//        relational operation
        int e=20;
        int r=30;
        boolean chat=e>r;
        System.out.println(chat);
        boolean no=e>=r;
        System.out.println(no);
        boolean nom =   e<=r;
        System.out.println(nom);
        boolean nm=e==r;
        System.out.println(nm);
        boolean nb=e!=r;
        System.out.println(nb);

        boolean  t=100<10 || 120<521;
        System.out.println(t);

        int score=700;
        if(score>75){
            System.out.println("Passed");
        }else {
            System.out.println("FAiled");
        }


    }
}

