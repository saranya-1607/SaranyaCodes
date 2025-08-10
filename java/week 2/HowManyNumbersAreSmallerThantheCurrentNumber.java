import java.util.*;
class smaller{
    public int[] small(int[] nums){
        int[] buckets = new int[120];
        for(int num : nums){
            buckets[num]++;
        }
        for(int i=1;i<buckets.length;i++){
            buckets[i] += buckets[i-1];
        }
        int[] result = new int[nums.length];
        for(int i=0;i<result.length;i++){
            if(nums[i]==0) result[i]=0;
            else
            result[i] = buckets[nums[i]-1];
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums ={8,2,2,1};
       smaller obj = new smaller();
       int[] res = obj.small(nums);
       System.out.println(Arrays.toString(res));
    }
}
