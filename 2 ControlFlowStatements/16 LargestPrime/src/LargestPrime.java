public class LargestPrime {

    public static int getLargestPrime(int x) {

        //the method should calculate the largest prime factor
        //of a given number and return it

        if (x <= 1) {
            return -1;
        }
        int i;
        for (i = 2; i <= x; i++) {

          if (x % i == 0) {
              x /= i;
              i--;
          }
        }
        return i;
    }
}
