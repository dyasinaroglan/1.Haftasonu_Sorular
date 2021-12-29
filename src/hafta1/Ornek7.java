package hafta1;

public class Ornek7 {
    public static void main(String[] args) {

        String myStr = "kanunların ruhu üzerine";
        System.out.println(myStr.length());

        String ilkHarf = myStr.substring(0,1);
        String sonHarf = myStr.substring(myStr.length()-1)+"";
        String ortaKarakter = myStr.charAt(myStr.length()/2)+"";

        System.out.println(ilkHarf+"\n"+ortaKarakter+"\n"+sonHarf);

        int ilkİndex = ilkHarf.length()-1;
        int ortaİndex = myStr.length()/2;
        int sonİndex = myStr.length()-1;
        System.out.println(ilkİndex);
        System.out.println(ortaİndex);
        System.out.println(sonİndex);

        int toplam = ilkİndex+ortaİndex+sonİndex;
        System.out.println(toplam);



        String birlestir = ilkHarf.concat(ortaKarakter);
        String hepsiBirles = birlestir.concat(sonHarf);
        System.out.println(hepsiBirles);

    }
}
