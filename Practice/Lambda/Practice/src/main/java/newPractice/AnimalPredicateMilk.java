package newPractice;

public class AnimalPredicateMilk implements AnimalPredicate{
    @Override
    public boolean cowMilk(Animal animal) {
        return animal.getCowMilk()>15 ;

    }
}
