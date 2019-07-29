public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {

        //the method should return true if at least two of the numbers
        //share the same rightmost digit
        //otherwise it should return false

        if (!isValid(x) || !isValid(y) || !isValid(z)) {

            System.out.println("Invalid NUmber");
            return false;
        }

            int lastX = x % 10;
            int lastY = y % 10;
            int lastZ = z % 10;

            return  (lastX == lastY || lastX == lastZ || lastY == lastZ);
    }

    public static boolean isValid(int w) {

            if (w >= 10 && w <= 1000) {
                System.out.println("True Valid");
                return true;
            }
            return false;
    }
}
