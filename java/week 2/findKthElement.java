import java.util.Arrays;
class findKthElement {
    public static void main(String[] args) {
        int[] arr ={3,4,68,8,9};
        Arrays.sort(arr);
        System.out.println("Sorted array:"+Arrays.toString(arr));
        int k=3;
        for(int i : arr){
            if(k==i){
                System.out.println("Kth element in arr is:"+arr[i]);
            }
        }
    }
}
