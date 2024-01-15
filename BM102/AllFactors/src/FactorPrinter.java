public class FactorPrinter {
    public static void printFactors(int x) {
        if (x <= 1) {
            System.out.println("İnvalid Value");

        }

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }

        }
    }
}


