public class d {
    public static void main(String[] args) {

        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.


        double yukseklik = 200;
        int ziplama = 0;
        double toplamYol = 0;

        do {
            ziplama++;
            toplamYol += yukseklik;
            yukseklik *=0.75;
            toplamYol += yukseklik;

        } while (yukseklik >= 100);

        System.out.println(toplamYol);
        System.out.println(ziplama);


    }
}
