public class Main {
    public static void main(String[] args) {
        testGetBucketCount();
    }

    public static void testGetBucketCount() {
        System.out.println("Test 1:");
        int result1 = PaintJob.getBucketCount(6.24, 5.75, 6.25, 3);
        System.out.println("Result: " + result1);

        System.out.println("\nTest 2:");
        int result2 = PaintJob.getBucketCount(3.4, 2.5, 2.0, 2);
        System.out.println("Result: " + result2);
    }
}
