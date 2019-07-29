public class AreaCalculator {

    public static double area(double radius){

        if (radius <= -1){
            return -1.0;
        }
        double areaCircle = radius * radius * Math.PI;
        return areaCircle;
    }

    public static double area(double x, double y){

        if ((x <= -1) ||(y <= -1)){
            return -1.0;
        }
        double areaR = x * y;
        return  areaR;
    }
}
