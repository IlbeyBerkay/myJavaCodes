import java.util.Scanner;

public class Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0 ;
        do{
            System.out.println("Enter number #" + count + ":");
            String nextNumbers = scanner.nextLine();
            try{
                int numbers = Integer.parseInt(nextNumbers);
                count++;
                sum+= numbers;
            }
            catch (NumberFormatException nfe){
                System.out.println("Invalid Number !! Try again. ");
            }
        }
        while(count <= 5) ;
        System.out.println("Sum of the integers :" + sum );
    }
}
