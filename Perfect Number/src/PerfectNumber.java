public class PerfectNumber {
    public static boolean  isPerfectNumber( int number ){
        int result = 0 ;

        if(number<1){
            System.out.println("Invalid value");

            return false ;
        }
        for(int i= 1 ; i<number ; i++){
            int remainder = number % i ;
            if(remainder == 0 ){
                  result += i ;
                  if(result == number){
                      System.out.println("It is perfect number");
                      return true;
                  }
            }
        }
        System.out.println("It is NOT perfect number");

        return false;
    }
}
