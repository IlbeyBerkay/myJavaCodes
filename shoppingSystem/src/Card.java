public class Card {
    private String creditCardNo ;
    private String cvc;
    public Card(String creditCardNo ,  String cvc){
        this.creditCardNo=creditCardNo;
        this.cvc=cvc;
    }
    public String  getCreditCardNo(){
        return creditCardNo;
    }
    public void setCreditCardNo(String creditCardNo){
        this.creditCardNo=creditCardNo;
    }
    public String  getCvc(){
        return cvc;
    }
    public void setCvc(String cvc){
        this.cvc=cvc;
    }

}
