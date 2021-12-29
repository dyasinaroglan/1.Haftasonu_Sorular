package hafta1;

public class Ornek5 {
    public static void main(String[] args) {
        /*6. Girilen metnin ilk ve son harflerinin yerlerini değiştirip yeni bir string oluşturup ekrana yazınız
                 String str = “Java”;
                 Çıktı : aavJ

         */

        String metin = "ezilmişler";
       String ilkHarf = metin.charAt(0)+"";
        String sonHarf = metin.charAt(metin.length()-1)+"";
        String ara = metin.substring(1,metin.length()-1);

        System.out.println(sonHarf+ara+ilkHarf);


           }
}
