package hafta1;

public class Ornek2 {
    public static void main(String[] args) {
        /*2. Verilen bir String değerinin ilk yarısını ekrana yazdırınız.
                String str = “Java”;
                 Çıktı : Ja
         */

        String kelime = "rukiye güzel";
        int yarısı = kelime.length()/2;
        String yarısınıYazdır = kelime.substring(0,yarısı);
        System.out.println(yarısınıYazdır);

        /*2. Verilen bir String değerinin ilk yarısını ekrana yazdırınız.
                 String str = “Java”;
                 Çıktı : Ja

         */
        String cümle = "ali güzel biner";
        int yarısı1 = cümle.length()/2;
        String digerYarısı = cümle.substring(yarısı1); //artık yarısından sonrasını yazdırır. substring(0,diger yarısı)
        //ilk yarısını alırdı.
         System.out.println(digerYarısı);
    }
}
