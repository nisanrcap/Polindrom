//Klavyeden girilen kelimenin palindrom olup olup olmadığını kontrol eden bir metodu ve testini yazın.
// isPalindrom metodu olmalı. İlk olarak bir tane palindrom bir tane de palindrom olmayan girdi gönderilerek
// sonuçları ekrana yazdırılmalıdır. Ardından klavyeden giriş alınarak girilen değer kontrol edilmeli ve
// sonuç ekrana yazdırılmalıdır.

import java.util.Scanner;

public class Main {
    public static void isPalindrome(String kelime) {
        StringBuilder tkelime = new StringBuilder();
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tkelime.append(kelime.charAt(i));
        }

        if (kelime.equals(tkelime.toString())) {
            System.out.println("Kelime palindromdur.");
        } else {
            System.out.println("Kelime palindrom değildir.");
        }
    }

    public static void main(String[] args) {
        for(int i=0; i<2; i++) {
            System.out.println("Kelimeyi yazınız:");
            Scanner input = new Scanner(System.in);
            String kelime = input.nextLine();
            isPalindrome(kelime);
        }
    }
}