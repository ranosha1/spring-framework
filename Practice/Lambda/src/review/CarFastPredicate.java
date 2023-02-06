package review;

public class CarFastPredicate implements CarPredicate{
    @Override
    public boolean fastCar(Car car) {
        return car.getMake()>2020;
    }
}
