package Workout.Inheritance;

public class Encapsulation {
    //Encapsulation(Kapsülleme) veri girilecek ya da veri alan field(alan) lara direk ulaşılmasınlar diye oluşulmuş bir sistem.
    private int age;
    private String name;
    private String surName;
    //Setter method(Set yazmak için)
    public void SetName(String name){
        this.name = name;
    }
    //Getter method(Get okumak için)
    public String GetName(){
        return name;
    }
    public void SetSurName(String surName){
        this.surName = surName;
    }
    public String GetSurName(){
        return surName;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public int GetAge(){
        return age;
    }
}
