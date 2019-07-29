public class FactorPrinter {

    public static void printFactors(int number){

        //the method should print all the factors of the number

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
