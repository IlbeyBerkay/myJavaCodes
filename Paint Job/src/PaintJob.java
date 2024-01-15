import java.util.InputMismatchException;
import java.util.Scanner;

public class PaintJob {
    public static int getBucketCount ( double width , double height , double areaPerBucket , int extraBuckets) {
        Scanner scanner = new Scanner(System.in);
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        int result = (int) Math.ceil((width * height) / areaPerBucket);
        System.out.println("He needs to buy " + result + " and , he has " + extraBuckets + " at home.");
        return result -extraBuckets ;
    }
    public static int getBucketCount( double width, double height, double areaPerBucket ) {
        Scanner scanner2 = new Scanner(System.in);
        int result = 0 ;
        if(width<=0 || height<=0 || areaPerBucket<=0){
            return -1;
        }

        result = (int) Math.ceil((width * height) / areaPerBucket);

        return result;
    }
    public static int getBucketCount( double area  , double areaPerBucket ) {
        Scanner scanner3 = new Scanner(System.in);
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        int result  = (int) Math.ceil(area / areaPerBucket);
        return result ;
    }

}
