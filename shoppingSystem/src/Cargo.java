public class Cargo {
    private int cargoID;
    private String cargoName;
    private double cargoPrice;

    public Cargo(int cargoID , String cargoName , double cargoPrice){
         this.cargoID = cargoID;
         this.cargoName = cargoName;
         this.cargoPrice = cargoPrice;

    }
    public int getCargoID(){
        return cargoID;
    }
    public void setCargoID(int cargoID){
        this.cargoID = cargoID;
    }
    public String getCargoName(){
        return cargoName;
    }
    public void setCargoName(String cargoName){
        this.cargoName=cargoName;
    }
    public double getCargoPrice(){
        return cargoPrice;
    }
    public void setCargoPrice(double cargoPrice){
        this.cargoPrice= cargoPrice;
    }

}
