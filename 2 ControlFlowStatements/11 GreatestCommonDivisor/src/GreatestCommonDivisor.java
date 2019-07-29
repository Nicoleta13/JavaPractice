public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        //the greatest common divisor is the largest positive integer
        //that can fully divide each of the integers(without leaving a remainder)

        if ((first < 10) || (second < 10)) {
            System.out.println("Invalid Number");
            return -1;
        }


        while (first != 0 && second != 0) {
            int number = second;
            second = first % second;
            first = number;
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

        }
        int rez = first + second;
        System.out.println("Nrrr " + rez);
        return rez;
    }
}
