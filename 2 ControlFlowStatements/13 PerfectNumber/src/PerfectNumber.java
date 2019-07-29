public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
        return  sum == number;
    }
}
