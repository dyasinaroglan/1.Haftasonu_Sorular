package hafta1;

public class Ornek6 {
    public static void main(String[] args) {
        /*Girilen metnin ilk yarısı ile ikinci yarısının yerlerini değiştirerek yeni bir string oluşturup ekrana yazınız
        String str = “Java nasıl”;                Çıktı : nasılJava
        String str = “telekominikasyon”;        Çıktı : nikasyontelekomi

         */

        String metin ="java nasıl";

        int bosluk = metin.indexOf(" ");

        String ilk = metin.substring(0,bosluk);
        String son = metin.substring(bosluk+1);

        System.out.println(son.concat(ilk));

        System.out.println("-----------------------------");

        String metin1 ="telekominikasyon";
        int yarısı = metin1.length()/2;

        String ilk1 = metin1.substring(0,yarısı);
        String son1 = metin1.substring(yarısı+1);

        System.out.println(son1.concat(ilk1));
    }
}
