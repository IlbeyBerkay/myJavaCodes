import java.time.LocalDateTime;

public class Shipment {
       private int shipmentID;
       private String shipmentType;
       private LocalDateTime shipmentDate;
       private double shipmentPrice;

       public Shipment(int shipmentID , String shipmentType , LocalDateTime shipmentDate , double shipmentPrice){
           this.shipmentID = shipmentID;
           this.shipmentType=shipmentType;
           this.shipmentDate=shipmentDate;
           this.shipmentPrice=shipmentPrice;

       }

       public int getShipmentID(){
           return shipmentID;
       }

      public void  setShipmentID(int shipmentID){
         this.shipmentID=shipmentID;
      }
      public String getShipmentType(){
        return shipmentType;
      }

      public void  setShipmentType(String shipmentType){
        this.shipmentType= shipmentType;
      }
      public LocalDateTime getShipmentDate(){
         return shipmentDate;
      }

      public void  setShipmentDate(LocalDateTime shipmentDate){
        this.shipmentDate=shipmentDate;
      }
      public double getShipmentPrice(){
        return shipmentPrice;
      }

      public void  setShipmentID(double shipmentPrice){
        this.shipmentPrice=shipmentPrice;
      }
    public String displayShipmentDetails() {
        StringBuilder details = new StringBuilder("Shipment Details (Shipment ID: " + shipmentID + ")\n");
        details.append("Shipment Date: ").append(shipmentDate).append("\n");
        details.append("Shipment Type: ").append(shipmentType).append("\n");

        if (!"Regular Shipment".equals(shipmentType)) {
            details.append("Shipment Price: $").append(shipmentPrice).append("\n");
        }

        return details.toString();
    }



}
