import java.time.LocalDateTime;

public class Refund {

        private int refundID;
        private int orderID;
        private LocalDateTime refundDate;
        private String reason;
        private double refundedAmount;

        // Constructor
        public Refund(int refundID, int orderID, String reason, double refundedAmount) {
            this.refundID = refundID;
            this.orderID = orderID;
            this.refundDate = LocalDateTime.now();
            this.reason = reason;
            this.refundedAmount = refundedAmount;
        }

        // Getter methods
        public int getRefundID() {
            return refundID;
        }

        public int getOrderID() {
            return orderID;
        }

        public LocalDateTime getRefundDate() {
            return refundDate;
        }

        public String getReason() {
            return reason;
        }

        public double getRefundedAmount() {
            return refundedAmount;
        }

        // Setter methods
        public void setRefundID(int refundID) {
            this.refundID = refundID;
        }

        public void setOrderID(int orderID) {
            this.orderID = orderID;
        }

        public void setRefundDate(LocalDateTime refundDate) {
            this.refundDate = refundDate;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public void setRefundedAmount(double refundedAmount) {
            this.refundedAmount = refundedAmount;
        }
}
