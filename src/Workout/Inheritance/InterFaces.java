package Workout.Inheritance;
//Burada Hem Interfaceslerden Hem de Abstract sınıflardan bahsedeceğim
//Birbirine benzendiğini iddia edenler olsa da aslında bayağ farklı dır hem kullanım hem ihtiyaç bakımından
//Aşağıda Hem bir Interface hem de bir Abstract(Soyut) bir sınıf oluşturdum
/*Interface e bakarsak ancak ve ancak metotların imzaları bulunur yani Interfacelerin içine bir işlem yapamassın. Ama Interfacesler Multi Inheritance yapmak için en uygun araçlardan
biridir. Şimdi iki tane sınıf oluştturmuş olalım ve bu iki sınıfı bir alt sınıfa extend etmek istiyoruz malesef sınıflar iki sınıf birden extend yapamıyor işte tam burda Interfacesler
devreye girer bunun için iyi bir örnek var.

Mesela bir karavan düşünün hem araç olarak kullanıla bilen hem de için oturup yaşayabileceğiniz bir araç. Şimdi siz bir karavan sınıfı oluşturdunuz fakat karavan hem oturulabilir
hem sürülebilir olduğu için ekstra kod klabalığı olmasın diye hareket edebilen ve yaşanabilir adında sınıflar eklemek istiyorsunuz. Sınıf olarak eklenemeyeceğinden Interface oluşturmak
durumun da kalıcaksınız çünkü Interfaces ler bize tek bir sınıfa birden fazla implementasyon yapmamızı sağlıyor. Fakat bahsettiğim gibi Interfacesler sadece metotları tutar yani işlemi
implemente ettiğiniz sınıfın içinde yaparsınız. Ayrıca Interfaces ler contructor içeremez sadece ve sadece imza içerir

 */


/*Abstract sınıflar ise adı üstünde bir sınıf tır en başta. Aşağıdaki örnekte bir Araba Abstract sınfı oluşturdum dikkat çekmek istediğim yer abstract ile oluşturmuş olduğum metot
asbtract metotlar eğer başka bir sınıf o abstract sınıfı miras alırsa tanımlanmış abstract metotdu kullanmak zorunda. Yani abstract içinde oluşturmuş olduğum asbtract metot nereye miras verilerise
verilsin kullanmak zorundasın mesela bir hesap sınıfı olduğunu düşünelim ve lullanıcıya adını ve şifresini girmesini istiyoruz abstarct metot olarak girilmiş sınıflarda sen
o metotdu kullanmak zorunda bırakılacaksın yoksa hatta ile karşılaşırsın.
 */

public class InterFaces extends Car{

    @Override
    public void SpeedTest() {
        System.out.println("Hızlı");
    }
}
interface Database{
    void login();
    void add();
    void delete();
    void get();
}

abstract class Car{
    int speed;
    int acc;
    public abstract void SpeedTest();

    public void printNow(){
        System.out.println("Test");
    }

}