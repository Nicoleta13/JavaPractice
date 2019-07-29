public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double second){

        double first =  one * 1000;
        double sec =  second * 1000;

        int firstI = (int) first;
        int secI = (int) sec;

        if (firstI == secI) {
            return true;
        } else return false;
    }
}
