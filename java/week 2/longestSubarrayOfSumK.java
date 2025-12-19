//BRUTE FORCE APPROACH:
class longestSubArray{
    public static int longestSubarray(int[] nums,int k){
        int res =0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
            
            if(sum == k){
                int subLen = j-i +1;
                res = Math.max(res,subLen);
            }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums ={1,2,3,4,1,1,1,1,2,3};
        int k =4;
        System.out.println(longestSubarray(nums,k));
    }
}

////OPTIMIZED APPROACHH;::::::::::::::::;;;

import java.util.HashMap;
class longestSubarrayOfSumK{
    public static int longestSubarray(int[] arr,int k){
       HashMap<Integer,Integer> hm = new HashMap<>();
       int res=0;
       int prefSum =0;
       for(int i=0;i<arr.length;i++){
           prefSum += arr[i];
           if(hm.containsKey(prefSum-k))
               res = Math.max(res,i- hm.get(prefSum-k));
               if(!hm.containsKey(prefSum)) hm.put(prefSum,i);
           
       }
       return res;
    }
    public static void main(String[] args){
        int[] arr ={5,2,2,5,1,1,1,1,4};
        int k =4;
        System.out.println(longestSubarray(arr,k));
    }
}
