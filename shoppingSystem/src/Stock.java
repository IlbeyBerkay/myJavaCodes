public class Stock {

        private int productID;
        private int quantity;

        public Stock(int productID, int initialQuantity) {
            this.productID = productID;
            this.quantity = initialQuantity;
        }

        public int getProductID() {
            return productID;
        }
       public void SetProductID(int productID) {
          this.productID = productID;
       }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void increaseStock(int amount) {
            if (amount > 0) {
                this.quantity += amount;
                System.out.println(amount + " " + getProductID() + " added to stock.");
            }
        }

        public void decreaseStock(int amount) {
            if (amount > 0 && amount <= this.quantity) {
                this.quantity -= amount;
                System.out.println(amount + " " + getProductID() + " removed from stock.");
            } else {
                System.out.println("Not enough stock available.");
            }
        }
    }

