public class SummOdd {

    public static boolean isOdd(int number) {

        //the method should use a for loop to sum all odd numbers in that range

        if ((number > 0) && (number % 2 == 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if ((end >= start) && (start > 0) && (end > 0)) {
            int sum =0;
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    System.out.println(i + " is an odd number ");
                    sum += i;
                }
            }
            System.out.println("The sum is " +sum);
            return sum;
        }
        return -1;
    }
}
