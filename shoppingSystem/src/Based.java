public class Based {
    private String userName;
    private String userSurname;
    private String mail;
    private String address;
    private String userID;
    private String  userPassword;

    public Based ( String userName , String userSurname , String mail,String address,String  userID ,String  userPassword){
        this.userName = userName ;
        this.userSurname = userSurname ;
        this.mail = mail ;
        this.address = address ;
        this.userID = userID ;
        this.userPassword = userPassword ;

    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName =userName;
    }

    public String getUserSurname() {
        return userSurname;
    }
    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
