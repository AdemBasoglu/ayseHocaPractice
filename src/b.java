import java.util.Scanner;

public class b {


    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen 5 sayi giriniz");
        int count=0;
        int enBuyukSayi=0;

        while (count<5) {

            int sayi = scan.nextInt();

            if (sayi>enBuyukSayi)
                enBuyukSayi=sayi;

            count++;
        }
        System.out.println("girilen sayilarin enbuyugu = "+ enBuyukSayi);
    }
}
