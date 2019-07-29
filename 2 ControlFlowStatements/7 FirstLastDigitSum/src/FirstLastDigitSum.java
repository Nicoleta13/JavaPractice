public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        //the method needs to find the first and the last digit of a number
        //passed to the method, and return the sum of them

        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        int sum = 0;
        int lastNumber = number % 10;
        int firstNumber = number;

        // Remove last digit from number
        // till only one digit is left
        //to know the first number
        while (firstNumber >= 10) {
            firstNumber /= 10;
        }

        System.out.println("First Digit is: " + firstNumber);
        System.out.println("Last Digit is: " + lastNumber);
        sum = firstNumber + lastNumber;
        return sum;
    }
}
