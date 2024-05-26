import java.util.Arrays;

public class LinearSearchInStrings {
    public static void main(String[] args) {
    String name1 = " yuvraj ";
    char target = 'u';
//        System.out.println(search(name1,target));
        System.out.println(Arrays.toString(name1.toCharArray()));
    }
    public static boolean search ( String name1, char target){
        if ( name1.length() == 0){ return false;}
        for ( char ch : name1.toCharArray()){
            if ( ch == target) {
            return  true;
            }
        }
        return false;

    }


}
