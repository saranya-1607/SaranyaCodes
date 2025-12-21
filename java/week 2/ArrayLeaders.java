import java.util.*;
class ArrayLeaders{
    public static ArrayList<Integer> leaders(int[] nums){
        int n = nums.length;
        ArrayList<Integer> ans  = new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
        int max =nums[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(nums[i] > max){
                max = nums[i];
                ans.add(max);
            }
        }
        return ans;
        
    }
    public static void main(String[] args){
        int[] nums ={10, 22, 12, 3, 0, 6};
        
        ArrayList<Integer> result = leaders(nums);
        System.out.println("the array leaders are:");
        for(int num: result){
            System.out.print(num + " ");
        }
    }
}
