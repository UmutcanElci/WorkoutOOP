package Workout.Object;
//
public class BasketballPlayer {
    //Şimdi obje nin ne olduğu ile başlayalım obje gerçek hayatta gördüğümüz her şey olabilir bir bina, araba hatta insan
    //Basketbol oyuncusu isminde bir class oluşturdum ve field(alan) verdim. Field dediğimizde aslında bu obje için gerekli  duyulan ve tutulması gereken verilerden bahsediyorum.
    //Bu veriler her yeni bir oyuncu girmek istediğimizde kullanıcı ya da bizim tarafından isteyeceğimiz ve girilmesi gereken veriler.
    String name;
    String surName;
    String position;
    int jerseyNumber;
    double height;
    double wingspan;
    //Objeler alan oluşturlup tutulduğu gibi bir işlevide gerçekleştirebilir bunlara da method deriz.
    //Örnek olarak bir basketbol oyuncusunun yapıcağı bazı işlevleri örnek alalım.
    void shoot() {}
    void block(){}
    void rebound(){}
    //Burada verdiğim methodlarda alanlarımızı ya da başka türlü bizim gireceğimiz verileri kullanarak çalıştırabiliriz.

    /*Şimdi toparlıyalım elimizde bir classımız var bu classı bir obje oluşturmak için kullanıyoruz ve objemizi oluşturduğumuzda classımızın içinde
    belirlerdiğimiz ve girilmesi veya uygulanmasını istediğimiz gereken alan ve methodlarımız var. Alanlarımız objemiz için gerekli verileri tutyor.
    Methodlarımız ise belirlediğimiz şekilde bir şlev sunuyor örnekte olduğu gibi şut atmak gibi
     */

    //Constructors(Yapıcı denebilir) özel bir method dur ve görevi objemizi oluşturmak ve işlemektir basitçe.
    //Constructors oluştururken basit kurallar vardı ilki Constructors bir geri dönüş tipi yoktur ya da geri dönüştipi oluşturduğumuz classtır demek yanlış olmaz.
    //Son olarak da Constructors classımızın ismi ile aynı olmak zorunda dır.
    public BasketballPlayer(String name, String surName, String position, int jerseyNumber){
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }
    //Yapıcımızı oluşturduk şimdi eğer biz bir obje oluşturmak istiyorsak classımız daki alan ve methodları çekmek için this anahtar kelimesini kullanırız.
    //this anahtar kelimesinin özelliği alanlarımız ve girilecek verilerin isimlerinin aynı olması diye biliriz şimdilik bu konuyu derinlice ilerde açıklıyacağım.

}
