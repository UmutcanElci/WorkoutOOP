package Workout.Inheritance;

import Workout.Object.BasketballPlayer;

public class PointGuard extends BasketballPlayer {
    /*Inheritance(Miras) classlarımızın karmaşıklığını azaltmamıza yardımcı olur en basit anlatımıyla mesela örneğimizde bir basketbol oyuncusu sınıfımız var.
    Basketbol oyuncusu dediğimizde her oyuncuyu her mevkiden bahsediyorum ama eğer biz onları mevki mevki ayırmak istiyorsak ve her mevkinin kendine özel yetenekleri var.
    Tek tek mevki classları oluşturup yazdıklarımızı en baştan tekrar yazmamak için Inheritance(Miras) kullanırız böylelikle ana miras aldığım sınıfımızdaki field olsun method olsun
    hepsinin oluşturduğumuz yeni classımızda kullanabiliriz.
     */
    int shooting;
//Burada bir oyun kurucu sınıfı oluşturdum bu sınıfta oyun kurcuların diğer mevkilere göre daha iyi oldukları özellkiler ekleye bilirim
    //BasketballPalyer classımızı anne pointGuard ı da çocuğu olarak düşüne biliriz bunun gibi diğer mevkiler içinde sınıflar oluşturacağım
    //Öncelikle Inheritance kurallarına bakalım ana sınıfdan bi alt sınıfa bağlamak için extend anahtar kelimesini kullanıyoruz
    //extend ettiğimz classımızda ana class daki field ve methodları otomatikman alıyor yani onları tekrar yazmamıza gerek kalmıyor.
    //Ayrı olarak ihtiyacımız olan alan ve methodları alt sınıfa yazdrıp alt sınıf adıyla obje oluşturuyoruz.
    public PointGuard(String name, String surName,  int shooting, int jerseyNumber) {
        /*Bildiğinz ana sınıfımızda obje oluştumak için Contructor var ve bu Contructor girmek ya da doldurmak istediğimiz alanları çağırmak ve aynı zamanda sınıfın içindeki
        methodları kullanmak için kullanıyoruz.Başka bir sınıfdan mşraz alındığında ana sınıfda var olan Contructor ı çağırmak için super anahtar kelimesini kulalnıyoruz bu saye de
        üst sınıfdaki Contructor ın yerine geçiyor.
         */
        super(name, surName, jerseyNumber);
        this.shooting = shooting;
        //Kendi istediğimiz veriyi de girdikten sonra print methodu ile artık çalıştırabiliriz.
    }

    public void printPointGuard(){
        printPlayer();
        System.out.println("Shooting : "+ shooting);
    }
}
