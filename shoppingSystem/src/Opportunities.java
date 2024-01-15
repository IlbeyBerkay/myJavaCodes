import java.util.HashMap;
import java.util.Map;

public class Opportunities {
    private Map<String, Double> productDiscounts; // Map to store product discounts
    private Map<String, Double> coupons; // Map to store coupons and their values

    public Opportunities() {
        this.productDiscounts = new HashMap<>();
        this.coupons = new HashMap<>();
    }

    // Set special discount for a product
    public void setProductDiscount(String productName, double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            productDiscounts.put(productName, discountPercentage);
            System.out.println("Special discount set for " + productName + ": " + discountPercentage + "%");
        } else {
            System.out.println("Invalid discount percentage. Please provide a percentage between 0 and 100.");
        }
    }

    // Set coupon with a specific value
    public void setCoupon(String couponCode, double couponValue) {
        coupons.put(couponCode, couponValue);
        System.out.println("Coupon set with code " + couponCode + " and value: $" + couponValue);
    }

    // Getter for product discounts
    public Map<String, Double> getProductDiscounts() {
        return productDiscounts;
    }

    // Getter for coupons
    public Map<String, Double> getCoupons() {
        return coupons;
    }

}
