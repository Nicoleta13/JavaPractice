public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (num > 0) {
            //extract the least-segnificant digit
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return number == reverse;
    }
}