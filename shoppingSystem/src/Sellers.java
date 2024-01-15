public class Sellers {
    private String shopName ;
    private String whatYouSell ;
    private int sellerID;


    public Sellers(String shopName , String whatYouSell  ,int sellerID){
        this.shopName = shopName;
        this.whatYouSell = whatYouSell;
        this.sellerID = sellerID;

    }

    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getWhatYouSell() {
        return whatYouSell;
    }
    public void setWhatYouSell(String whatYouSell) {
        this.whatYouSell = whatYouSell;
    }

    public int getSellerID() {
        return sellerID;
    }
    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

}
