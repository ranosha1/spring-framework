package java;

public class ArrayPrac {
    public static void main(String[] args) {

        ArrayPrac ar=new ArrayPrac();
        //ar.sort();

        QuickSorting qs= new QuickSorting();
        ar.sort(qs);
        BubbleSorting bs=new BubbleSorting();
        ar.sort(bs);

       // Sorting myLambda=()-> System.out.println("Sorting");

        Sorting quickSort=()-> System.out.println("Quick Sorting");
        ar.sort(quickSort);

        Sorting bubbleSort=()-> System.out.println("Bubble Sorting");
        ar.sort(bubbleSort);
    }

    private void sort(Sorting sorting){
        sorting.sort();
    }

}


