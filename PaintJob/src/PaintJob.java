public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        double area;
        double bucketNeeded;

        if(height <= 0 || width <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        else{
            area = width * height;
            bucketNeeded =  (area / areaPerBucket) - extraBuckets;
        }
        return (int) Math.ceil(bucketNeeded);
    }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        double area;
        double bucketNeeded;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            area = width * height;
            bucketNeeded = area / areaPerBucket;
        }
        return (int) Math.ceil(bucketNeeded);
    }


    public static int getBucketCount(double area, double areaPerBucket){
        double bucketNeeded;
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            bucketNeeded = area / areaPerBucket;
        }
        return (int) Math.ceil(bucketNeeded);
    }
}
