public class TeenNumberChecker {

    public static boolean hasTeen(int one, int two, int three){

        if ((isTeen(one)) || (isTeen(two)) || (isTeen(three))){
            return true;
        } else return false;
    }

    public static boolean isTeen(int teen){

        if ((teen >= 13) && (teen <= 19)) {
            return true;
        } else return false;
    }
}
