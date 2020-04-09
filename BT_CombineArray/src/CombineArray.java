import java.lang.reflect.Array;
import java.util.Arrays;

public class CombineArray {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        int[] b = new int[] {1,1,9,8,7,6,5};
        //System.out.println(combineArr(a,b).toString());
        combineArr(a,b);
    }
    public static void combineArr (int[] x, int[] y){
        int size = x.length + y.length;
        int[] result = new int[size];
        for (int i = 0; i < x.length; i++){
            result[i] = x[i];
        }
        for (int i = x.length; i < size; i++) {
            result[i] = y[i-x.length];
//            for (int j = 0; j < y.length; j++) {
//                result[i] = y[j];
//            }
        }
        System.out.println(Arrays.toString(result));
        //return result;
    }
}
