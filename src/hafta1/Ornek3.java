package hafta1;

public class Ornek3 {
    public static void main(String[] args) {
        /*4. Verilen bir String değerinin ilk ve son harflerini ekrana yazdırın.
                   String str = “Java”;
                    Çıktı : Ja

         */
        String name = "Abdullah";
        String ilkHarf = name.substring(0,1);
        System.out.println(ilkHarf);
        int sonHarf = name.length()-1;
        String yazdır = name.substring(sonHarf);
        System.out.println(yazdır);

        System.out.println("2.yol----------------------------");

        String metin = "Yeni bir metin";

        char ilkKarakter = metin.charAt(0); //ilk karakter için char la o indisi çektik
        int sonIndex = metin.length()-1;   // int ile length-1 ile son karakterin uzunluğunu bulduk.
        char sonkarakter = metin.charAt(sonIndex);
        System.out.println(ilkKarakter+"".concat(sonkarakter+""));

    }
}
