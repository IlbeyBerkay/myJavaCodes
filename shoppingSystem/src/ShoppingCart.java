import java.util.ArrayList;
import java.util.List;

public class ShoppingCart  {

    private String totalPrice ;
    private List<Product> items;
    public ShoppingCart() {

        this.items = new ArrayList<>();
        this.totalPrice = totalPrice;

    }


    public String getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addItem(Product product){
         items.add(product);
    }
    public void removeItem(Product product){
        items.remove(product);
    }
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product item : items) {
            System.out.println(item.getProductName() + " - $" + item.getProductPrice());
        }
    }

    public void clearCart() {
        items.clear();
    }

    public List<Product> getItems() {
        return items;
    }
    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getProductPrice();
        }
        return total;
    }
}
