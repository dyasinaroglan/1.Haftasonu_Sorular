package hafta2;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        /* Soru 5) Kullanıcıdan bir metin girmesini isteyen ve bu metni tersten yazdıran programı yazınız.
        Input : Java ise Output: avaJ

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz");
        String str = scanner.nextLine();
        String cıktı ="";

        for (int i = str.length()-1  ; i >=0 ; i--) {
            cıktı= cıktı+ str.charAt(i);

        }
        System.out.println(cıktı);

    }
}
