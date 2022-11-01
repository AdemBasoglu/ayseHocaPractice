package day02;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */

        double sekerGr = 2.77;
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gunde kac bardak cay ictiginizi girin");
        double cayBardak = scan.nextDouble();

        System.out.println("kac seker kullandiginizi girin");
        double sekerSayisi = scan.nextDouble();

        double yillikSeker = (sekerGr * cayBardak *sekerGr)* 365 / 1000;
        double kirkYillikSeker = yillikSeker * 40;

        if (sekerSayisi == 0) {
            System.out.println("aferin boyle devam et");


        } else {
            System.out.println("yilda " + yillikSeker + " kg " + "kullanir");
            System.out.println("40 yilda  " + kirkYillikSeker + " kg " + " kullanir");
        }
    }
}