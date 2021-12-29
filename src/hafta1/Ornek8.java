package hafta1;

public class Ornek8 {
    public static void main(String[] args) {
        // girilen str'nin ilk ve son karakterini concat ile birleştirin
        String str = "Java Kursu";

        String ilkHarf = str.substring(0,1);
        String sonHarf = String.valueOf(str.charAt(str.length()-1));

        System.out.println(ilkHarf.concat(sonHarf));

    }
}
