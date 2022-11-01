package day02;

public class practice02 {
    public static void main(String[] args) {
        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        double vize = 80;
        double finalPuani = 70;
        double devamPuani = 50;
        double ortalama = (vize * 0.10) + (finalPuani * 0.8) + (devamPuani * 0.10);

        if (ortalama >= 70) {
            System.out.println("gectiniz");

        } else if (ortalama >= 60) {
            System.out.println("sartli gectiniz");


        } else System.out.println("kaldiniz");
    }
}
