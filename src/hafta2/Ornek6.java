package hafta2;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        /*   Soru 6 Kullanıcıdan bir tam sayı girmesini isteyen ve ardından sayıları ters çevrilmiş sayıyı veren
                  bir program yazın.
               Input: 12345 ise Output: 54321


         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        while (sayı>0){

            System.out.print(sayı%10);
            sayı = sayı/10;

        }
    }
}
