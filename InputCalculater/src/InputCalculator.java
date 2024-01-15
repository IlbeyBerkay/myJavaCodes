import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int count = 0 , SUM = 0 ;
        long AVG= 0 ;

        Scanner scanner = new Scanner(System.in);
        try{
            while(true){
                System.out.println("Enter a number:");
                boolean isAnInt = scanner.hasNextInt();

                if(isAnInt){
                    int number = scanner.nextInt();
                    SUM += number;
                    count++;
                }
                else{
                    System.out.println("Invalid input. Exiting the loop.");
                    break;                }
            }
            scanner.nextLine();
            if (count > 0) {
                double average = (double) SUM / count;
                System.out.println("SUM = " + SUM + " AVG = " + Math.round(average));
            } else {
                System.out.println("Unable to calculate average. Division by zero.");
            }

        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input. Exiting the loop due to an exception.");        }

    }
}
