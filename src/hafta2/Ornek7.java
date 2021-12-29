package hafta2;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        /*0 (sıfır) girilene kadar okutulacak tamsayılardan tek ve çift olanların sayısı ile teklerin ve
                    çiftlerin ayrı ayrı toplamlarını yazan programı yazın.


         */

        int tekCount = 0;
        int ciftCount = 0;
        int tekToplam = 0;
        int ciftToplam = 0;
        int sayı;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("sayı giriniz");
            sayı = scanner.nextInt();
            if (sayı % 2 == 0) {
                ciftToplam = ciftToplam + sayı;
                ciftCount++;
            } else {
                tekToplam = tekToplam + sayı;
                tekCount++;
            }


            System.out.println("devam etmek istiyor musunuz");
        }
        while (sayı!=0);
        System.out.println(tekCount+"------------"+tekToplam);
        System.out.println(ciftCount+"------------"+ciftToplam);

        }

    }


