public class LargestPrime {
    public static  int getLargestPrime(int number){
        int largestPrime = 0;
        int count = 0 ;
        for(int i=1 ; i<number/2 ; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if(number<2){
            System.out.println("Invalid value");
            return -1;
        }
        if(number == 2 ){
            largestPrime = 2 ;
        }
        for(int i=number ; i>1 ; i--){
           for(int j =2; j<i; j++){
               if((number%i == 0) && (i%j!=0)){
                     largestPrime=i;
                   }
               }
            }
        System.out.println(" " +largestPrime);
        return  largestPrime;
        }

}
