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
