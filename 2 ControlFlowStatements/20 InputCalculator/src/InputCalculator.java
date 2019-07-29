import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        //the method should not return anything(void)
        //it needs to keep reading int numbers from the keyboard

        //when the user enters something that is not an int
        //then it needs to print a message int the format
        //SUM = XX    AVG = YY
        //XX is the sum of all entered numbers of type int
        //YY is the calculated average of all numbers of type long

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {
            //System.out.println("Enter number: ");

            //it verifies if te number enetered is an integer
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                //return the int scanned from the input
                int number = scanner.nextInt();

                counter ++;
                sum += number;
                //use casting when calling round method
                //since it needs double as a parameter
                avg = Math.round((double)sum / counter);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
