public class DiagonalSatar {
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        for(int i=0 ; i<number-1 ; i++){
            System.out.print("* ");
            if(i==number){
                for(int k=0 ; k<number ; k++){
                    System.out.print("* ");
                }
            }
        }
        for(int j=0 ; j<number ; j++){
            System.out.println("*");
            if(j==number){
                for(int i=0 ; i<number ; i++){
                    System.out.print("* ");
                }
            }
        }
    }
}
