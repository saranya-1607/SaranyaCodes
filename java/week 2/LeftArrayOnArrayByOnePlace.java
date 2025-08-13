import java.util.Arrays;
class LeftArrayOnArrayByOnePlace{
    public static int[] rotate(int[] nums){
        int n = nums.length;
        int temp =nums[0];
        for(int i=1;i<n;i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
        return nums;
    }
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5,6,7};
        rotate(nums);
        System.out.println(Arrays.toString(nums));
    }
}
