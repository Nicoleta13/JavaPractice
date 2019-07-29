public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        //the parameter bigCounter => the count of big flour bags(5 kilos)
        //the parameter smallCounter => the count of small flour bags(1 kilo each)
        //the parameter goal => the goal amount of kilos of flour needed to assemble a package

        //therefore, the sum of the kilos of bigCount and smallCount
        //must be at least equal to value of goal

        //the method should return true if it is possible to make a package
        //with goal kilos of flour

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            System.out.println("Invalid Value");
            return false;
        }

        int bigKilos = bigCount * 5;
        int sumKilos = bigKilos + smallCount;
        int difference = (sumKilos - goal);

        if (sumKilos >= goal) {
            return (difference == 0 || (smallCount - (difference % 5) >= 0));
        }
        return false;
    }
}
