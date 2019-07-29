public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number ==0) {
            System.out.println("Zero");
        }

        int y = reverse(number);
        int z = getDigitCount(number) - getDigitCount(reverse(number));
        String numberWord = "";

        while (y > 0) {
            int lastDigit = y % 10;
            switch (lastDigit) {
                case 0:
                    numberWord += "Zero ";
                    break;
                case 1:
                    numberWord += "One ";
                    break;
                case 2:
                    numberWord += "Two ";
                    break;
                case 3:
                    numberWord += "Three ";
                    break;
                case 4:
                    numberWord += "Four ";
                    break;
                case 5:
                    numberWord += "Five ";
                    break;
                case 6:
                    numberWord += "Six ";
                    break;
                case 7:
                    numberWord += "Seven ";
                    break;
                case 8:
                    numberWord += "Eight ";
                    break;
                case 9:
                    numberWord += "Nine ";
                    break;
            }
            y /= 10;
        }

        for (int i = 1; i <= z; i++) {

            numberWord += "Zero ";
        }
        System.out.println(numberWord);
    }


    public static int reverse(int x) {

        int reversedNumber = 0;
        while (x != 0) {
            int remaining10 = x % 10;
            reversedNumber = reversedNumber * 10 + remaining10;
            x /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number ==0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            if ((number / 10) >= 0) {
                count++;
            }
            number /= 10;
        }
        return count;

    }

}

