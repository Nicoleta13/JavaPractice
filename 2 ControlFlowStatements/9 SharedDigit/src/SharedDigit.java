public class SharedDigit {

    public static boolean hasSharedDigit(int one, int two) {

        //the method should return true if there is a digit that appears in both numbers

        if (!(one >= 10 && one <= 99) || !(two >= 10 && two <= 99 )) {
            System.out.println("Invalid Number");
            return false;
        }

            while (one > 0){
                int lastN = two;
                while (lastN > 0){
                    if(one % 10 == lastN % 10) {
                        System.out.println("True");
                        return true;
                    }
                    lastN /= 10;
                }
                one /= 10;
            }
            System.out.println("False");
            return false;
    }
}
