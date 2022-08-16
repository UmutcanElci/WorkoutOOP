package Workout.Inheritance;

public class Polymorphism {
//Polymorphism anlamı çok biçimlilik demektir polymorphism mi kullanabilmek için Miras işlemi olmak zorundadır.
    //Polymorphism gayet basittir bu yüzden kodu burda comment olarak göstereceğim.
    //Bildiğiniz üzere bir BasketballPalyer sınıfımız var. Bu sınıf bütün oyuncuları kapsıyorken pointGuard sadece oyun kurucları kapsar. Buraya kadar bir sorun yok.
    /*
    Mesela Basketball sınıfımız olsun
    class BasketballPlayer(){

    void oyuncu(){
    System.out.println("Basketbol oyuncusu");
    }

    }
    class PointGuard extends BasketballPlayer(){
    //Ana sınıfdan alt sınıfa miras aldığımız da ana sınıf daki bazı metotları silmek veya değiştirmek isteye biliriz bu gibi işlemlerde Ovveride kavramını kullanırız.
    @Override
    void oyuncu(){
    System.out.println("Oyun kurucu");
    }

    }
   //Şimdi burya kadar işlemimiz aslında basit Basketball oyuncumuz var ve oyun kurcumuz oyun kurcu sınıfı Basketballplayer  snıfından miras alıyor.
   //Alınan miras ise oyuncu methodu şimdi main methodumuza dönelim
public class Main {

    public static void main(String[] args) {
             BasketballPlayer player = new BasketballPlayer();
             BasketballPlayer pointGuard = new PointGuard();
             //Gördüğünüz üzere PointGuard sınıfı BasketballPlayer sınıfından türemiştir miras alındığından dolayı fakat eğer biz ikisinde de aynı olan methodu çalıştırırsak

             player.oyuncu(); // Sonuç : "Basketbol oyuncusu"
             pointGaurd.oyuncu(); // Sonuç : "Oyun Kurucu"

             //İşte çok biçimlilik le demek istenilen konu bu miras aldık PointGuard sınıfı BasketballPlayer sınıfından türüyor ama geri gelen değerler farklı.
             //Burdan anladığımz BasketballPlayer sınıfı nı temel alarak pointGuard sınıfıdan obje oluşturduk (1)
             //Oyuncu methodunu çağırarak bir objenin birden fazla onje gibi davranabildiğini gördük. (2)
             //Override dan pek bahsetmedim PointGuard sınıfdan çağrılan metotdun farklı olması Ovveride kavramı sayesindedir.
             //(Bu konuda daha derin ve açık ileride yapılacak örneklerde olucam)

        }
    }
     */

}
