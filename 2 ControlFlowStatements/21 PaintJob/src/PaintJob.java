public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        int count = 0;
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            System.out.println("Invalid Value");
            return -1;
        }
        double area = width * height;
        int nrBucketsNeeded = (int) Math.ceil(area / areaPerBucket);
        int bucketsToBuy = nrBucketsNeeded - extraBuckets;
        System.out.println(bucketsToBuy);
        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double area = width * height;
        int nrBucketsNeeded = (int) Math.ceil(area / areaPerBucket);
        System.out.println(nrBucketsNeeded);
        return nrBucketsNeeded;

    }

    public static int getBucketCount(double area, double areaPerBucket){

        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int nrBucketsNeeded = (int) Math.ceil(area / areaPerBucket);
        System.out.println(nrBucketsNeeded);
        return nrBucketsNeeded;
    }
}
