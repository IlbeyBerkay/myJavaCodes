public class HourlyEmployee extends Employee{
    double hourlyPayRate ;
    public HourlyEmployee( double hourlyPayRate ){
        this.hourlyPayRate = hourlyPayRate;
    }
    public double getHourlyEmployee(){
        return hourlyPayRate;
    }

    public void setHourlyEmployee(double hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }

    public double   getDoublePay(){
        double doublePay =  hourlyPayRate * collectPay();
        return  doublePay;
    }
}
