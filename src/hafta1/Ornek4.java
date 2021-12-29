package hafta1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        /*5. Bir String tanımlayın. Tüm metin kücük harflerden oluşsun. Bulmanız gereken ilk harfin son geçtiği indexi bulmak
              String str = “bilgisayar budur”;
              ilk harf “b” olduğundan en son bulunan “b” nin indexini consola yazdırınız.

         */
        String str = "ali ata bak";
        String ilkHarf = str.charAt(0)+"";
        int lastIndex = str.lastIndexOf(ilkHarf);
        System.out.println(lastIndex);

        String str1 = "my planet oure";
        System.out.println(str1.lastIndexOf("e",12));

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.length());
        System.out.println(myStr.lastIndexOf("e", 26)); //lastIndexOf belirtilen harften sonra aynı harfin tekrar hangi indiste olduğunu
        //gösterir.
    }
}
