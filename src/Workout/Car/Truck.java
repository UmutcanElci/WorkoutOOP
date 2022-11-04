package Workout.Car;

public class Truck extends Car{
    private int weight;
    public Truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice(){
        if(weight > 2000){
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }else {
            return super.getSalePrice();
        }
    }

}
