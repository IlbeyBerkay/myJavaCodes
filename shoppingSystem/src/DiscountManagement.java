public class DiscountManagement {
    public double applyDiscount(double originalPrice, double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage. It should be between 0 and 100.");
            return originalPrice;
        }

        double discountAmount = originalPrice * (discountPercentage / 100);
        double discountedPrice = originalPrice - discountAmount;

        System.out.println("Discount applied: $" + discountAmount);
        return discountedPrice;
    }

    // Fiyata zam uygula
    public double applyMarkup(double originalPrice, double markupPercentage) {
        if (markupPercentage < 0) {
            System.out.println("Invalid markup percentage. It should be a positive number.");
            return originalPrice;
        }

        double markupAmount = originalPrice * (markupPercentage / 100);
        double markedUpPrice = originalPrice + markupAmount;

        System.out.println("Markup applied: $" + markupAmount);
        return markedUpPrice;
    }

    public static void main(String[] args) {
        DiscountManagement discountManager = new DiscountManagement();

        // Örnek: Fiyat indirimi uygula
        double originalPrice = 100.0;
        double discountPercentage = 20.0;
        double discountedPrice = discountManager.applyDiscount(originalPrice, discountPercentage);

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discounted Price: $" + discountedPrice);

        System.out.println();

        // Örnek: Fiyata zam uygula
        double markupPercentage = 10.0;
        double markedUpPrice = discountManager.applyMarkup(originalPrice, markupPercentage);

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Marked Up Price: $" + markedUpPrice);
    }
}
