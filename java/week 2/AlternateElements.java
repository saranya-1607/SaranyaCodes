import java.util.ArrayList;
import java.util.List;
public class AlternateElements{
    public static List<Integer> getAlternateElements(int[] arr){
        List<Integer> result = new ArrayList<>();
     for(int i=0;i<arr.length;i+=2)
     {
         result.add(arr[i]);
     }
     return result;
    }
    public static void main (String[] args){
        int[] arr ={1,2,3,4,5,6,7};
        List<Integer> result = getAlternateElements(arr);
        System.out.println(result);
    }
}
