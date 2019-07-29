public class MinutesToYearsAndDays {


    public static void printYearsAndDays(long minutes){

        long days = minutes / (60*24);
        //long remainMin = minutes % (60*24);
        long years = days / 365;
        long remainDays = days % 365;

        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + remainDays + " d");
        }
    }
}

