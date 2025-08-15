import java.util.Arrays;
class RotateArray189{
    public static int[] rotate(int[] nums,int k){
        int n = nums.length;
        k = k%n;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
        return nums;
    }
    public static void reverseNum(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
    public static void main(String[] args){
       int[] nums={1,2,3,4,5,6,7};
       int k =3;
       rotate(nums,k);
       System.out.println(Arrays.toString(rotate(nums,k)));
    }
}
