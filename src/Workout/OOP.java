package Workout;
import Workout.Inheritance.PointGuard;
import Workout.Object.BasketballPlayer;
public class OOP {
    public static void main(String[] args){
        //Obje oluşturma

        //BasketballPlayer player1 = new BasketballPlayer("Stephen","Curry","PG",30);

        //Inheritance

        PointGuard player = new PointGuard("Stephen","Curry",99,30);
        player.printPointGuard();
    }

}
