public class FlourPacker {
    public static boolean canPack ( int bigCount , int smallCount , int goal){
        int equal = bigCount*5 + smallCount*1 ;
        if ( bigCount < 0 || smallCount<0 || goal < 0){
            return false ;
        }
        if( (goal > equal || (goal % 5 > smallCount)) ){
            return false;

        }
        else {
            return true;
        }
    }
}
