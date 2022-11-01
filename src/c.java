public class c {
    public static void main(String[] args) {


        /*
         * Interview questions…
         *
         * write a return method to reverse number
         *
         * Input : 12345 Output : 54321
         */


        int input = 12345;
        System.out.println(reserveNumber(input));

    }


    public static int reserveNumber(int input) {
        int reverse = 0;

        while (input > 0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }
        return reverse;
    }
}


