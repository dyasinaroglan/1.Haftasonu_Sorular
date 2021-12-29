package hafta2;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        /* SORU 4) Klavyeden girilen herhangi bir sayının faktöriyel değerini bulan bir program yazın.
                   Bir sayının faktoriyeli, 1 den o sayıya kadar olan sayıların çarpımıdır.
                   Input: 5 ise Output: 1*2*3*4*5 = 120 olu

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        int faktöriyel=1;

        for (int i = 1; i <=sayı ; i++) {                               // i
            faktöriyel*=i;                               //faktöriyel 1    1
                                                         //faktöriyel 2    2
                                                         //faktöriyel 6     3

        }
        System.out.println(faktöriyel);
    }
}
