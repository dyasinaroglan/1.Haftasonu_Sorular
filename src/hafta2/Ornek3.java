package hafta2;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
       /* Soru 3)  Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın. Daha sonra bu sayının
        çarpım tablosunu yazdırmalıdır

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        for (int i = 1; i <=10 ; i++) {
          int carpım=sayı*i;
            System.out.println(sayı+"X"+i+"="+carpım);
        }
        }
    }

