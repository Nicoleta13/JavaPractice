public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) return true;
                    else return false;
                } else return true;
            } else return false;
        } else return false;
    }

    public static int getDaysInMonth(int month, int year) {

        int numberOfDays = -1;
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            System.out.println("Invalid number");
            return numberOfDays;
        } else {

            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        numberOfDays = 29;
                        System.out.println(numberOfDays);
                    } else {
                        numberOfDays = 28;
                        System.out.println(numberOfDays);
                    }
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    numberOfDays = 31;
                    System.out.println(numberOfDays);
                    break;
                default:
                    numberOfDays = 30;
                    System.out.println(numberOfDays);
                    break;
            }
        }
        return numberOfDays;
    }
}