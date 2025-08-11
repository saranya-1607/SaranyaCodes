import java.util.Arrays;
class SelectionSort{
    public static void selectionSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int min =i;
            for(int j=i;j<n-1;j++){
                if(nums[j] < nums[min]){
                    min =j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args){
        int[] nums = {3,5,78,3,23,55,77,55};
        System.out.println("before sorting:"+Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("after sorting:"+Arrays.toString(nums));
    }
}
