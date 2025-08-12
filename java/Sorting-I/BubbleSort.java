//WORST ,AVERAGE time complexity =O(N^2),
import java.util.Arrays;
class BubbleSort{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={5,6,7,2,3,4,98,5,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
so WE OPTIMIZE THE CODE.BECAUSE WHAT IF ARRAY IS ALREAFY IN SORTED ORDER.NO NEED OF SWAPS RIGHT!? YEAH SO WE HAVE OPTIMIZED APPROACH WHICH HAVE 
    TIME COMPLEXITY OF BEST CASE : O(N);
code:
import java.util.Arrays;
class BubbleSort{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            int didSwap =0;
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap =1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={5,6,7,2,3,4,98,5,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
