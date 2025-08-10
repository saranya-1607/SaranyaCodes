//BRUTE FORCE APPROACH...

class TwoSum {
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5,8};
        int n = nums.length;
        int target =7;
        boolean found = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("numbers:"+ nums[i]+"and "+nums[j]);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("not found");
            }
        }
    }
}

// OPTIMISED HASHMAP SOLUTION 0(N)

import java.util.*;
class solution{
    public int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
             map.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] nums ={1,3,6,7,8};
        int target = 13;
        solution obj = new solution();
        int[] result = obj.twosum(nums,target);
        System.out.println(Arrays.toString(result));
        
    }
}

