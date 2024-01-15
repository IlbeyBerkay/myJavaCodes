public class NumberToWords {
    public static String  numberToWords(int number){
        if(number<0){
            System.out.println("İnvalid Number");
        }
        switch(reverse(number)){
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid Digit";
        }
    }

    public static int reverse(int number){
        int reversedNumber = 0  ;
        int size = getDigitCount(number) ;
        int arr[] = { };
        for(int i = 0 ; i < size ; i ++){
             arr[i] = number % 10;
             reversedNumber = arr[i] +  10^(size-i);
             if(number<0){
                 reversedNumber = -1 * reversedNumber ;
             }
        }
        return  reversedNumber ;
    }

    public static int getDigitCount(int number){
        int count = 0 ;
        if(number < 0 ){
            return -1;
        }
        if(number == 0 ){
            return 0;
        }
        if(number > 0){
             while(number<10){
                 number /= 10 ;
                 count ++ ;
             }
        }
        return count;
    }
}
