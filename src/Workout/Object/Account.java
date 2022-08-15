package Workout.Object;

public class Account {
    //Burada access Modifiers(Erişim Değiştiricileri ya da Düzenliyicisi) dan bahsedicem.
    //Bazı verilerimizin sadece bize özel olması ve erişilmemesini sağlanayan Aslında Access Modifiers lardır (Yani bir bakıma biz kodu yazarken buna göre yazıcaz mantığa göre doğru erişilmeyecek daha karmaşık yere gelmemize var)
    //Burada kodu erişile bilir olup olmadığını belirleyen bazı Modifiers lar var.
    public String name;
    private String password;
    public boolean login(){
        return true;
    }
    //Basitçe baktığımız da Hesap adlı classımız daki hesabın ismini herkese public(açık) burda şimdilik bir kötülük yok fakat şifresini private(özel) olarak değiştirdik.
    //Amacımız başka private ın özelliği diğer başka bir class dan ulaşılmamasıdır yani password bu class da saklı korunuyor.
}
