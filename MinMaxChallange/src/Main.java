import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0 ;
        double min = 0 ;
        int loopCount = 0 ;

        while(true){
            System.out.println("Enter a number , or any character to exit");
            String nextEntry = scanner.nextLine();
            try{
                double validNum = Double.parseDouble(nextEntry);
                if(loopCount == 0 || validNum <min ){
                     min = validNum;
                }
                if(loopCount == 0 || validNum >max ){
                    max = validNum;
                }
                if( loopCount > 0 && validNum > max ){
                    max = validNum;
                }
                else if ( loopCount > 0 && validNum < min){
                    min = validNum;
                }


                loopCount++;
            }
            catch(NumberFormatException nfe ){
                System.out.println("No valid data entered");
                break;
            }

        }

        System.out.println("Max value is " + max );
        System.out.println("Min value is " + min );

    }
}
