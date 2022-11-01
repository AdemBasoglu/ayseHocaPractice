package day05;

import java.util.Scanner;

public class a {
    static int bolum = 0;

    public static void main(String[] args) {

//Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bolmek istediginiz sayiyi giriniz");
        int bolunenSayi = scan.nextInt();
        System.out.println("lutfen bolen sayiyi giriniz");
        int bolenSayi = scan.nextInt();


        System.out.println(bol(bolunenSayi, bolenSayi));



    }

    private static int bol(int bolunenSayi, int bolenSayi) {

        while (bolunenSayi >= bolenSayi) {
            bolunenSayi -= bolenSayi;
            bolum++;

        }

        return bolum;
    }

}
