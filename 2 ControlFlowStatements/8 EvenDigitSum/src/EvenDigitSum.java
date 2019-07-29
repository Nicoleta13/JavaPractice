public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        int sum = 0;
        int evenDigit = 0;
        int nr = number;
        while (nr > 0) {
            evenDigit = nr % 10;
            if (evenDigit % 2 == 0) {
                sum += evenDigit;
            }
            nr /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}
