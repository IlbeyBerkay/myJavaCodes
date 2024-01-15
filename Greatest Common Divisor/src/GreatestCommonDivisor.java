public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            System.out.println("Invalid Value");
            return -1;
        }

        int greatestDivisor = 1; // Başlangıçta en küçük ortak bölen 1'dir

        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }

        System.out.println("Greatest Common Divisor is " + greatestDivisor);
        return greatestDivisor;
    }
}
