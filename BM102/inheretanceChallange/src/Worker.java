import java.util.Scanner;

public class Worker {
    Scanner scanner = new Scanner(System.in);
    private String name ;
    private String birthDate;
    protected String endDate;

    public Worker(){}
    public Worker(String name , String birthDate , String endDate){
        this.birthDate = birthDate;
        this.name = name;
        this.endDate = endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge(){
        int currentYear = 2025 ;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }
    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
         this.endDate = endDate;
    }
    public String toString(){
        return  "Worker{ " +
                "name = ' " + name + '\'' +
                ", birthDate =  ' " + birthDate + '\'' +
                ", endDate = ' " + endDate + '\'' +
                '}';
    }
}
