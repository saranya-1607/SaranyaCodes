
//// BRUTE FORCE APPROACH:
class 53MaximumSubarray{
    public static int subarray(int[] nums){
        int maxi = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
          for(int j=i;j<nums.length;j++){
              int sum=0;
              for(int k=j;k<nums.length;k++){
                  sum += nums[k];
                  maxi = Math.max(maxi,sum);
              }
          }
      }  
      return maxi;
    }
    public static void main(String[] args){
        int[] nums ={5,4,-1,7,8};
        System.out.println(subarray(nums));
    }
}


/////BETTER SOLUTION/////////
class MaximumSubarray{
    public static int subarray(int[] nums){
        int maxi = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
          int sum=0;
          for(int j=i;j<nums.length;j++){
              sum += nums[j];
              maxi = Math.max(maxi,sum);
              
          }
      }  
      return maxi;
    }
    public static void main(String[] args){
        int[] nums ={5,4,-1,7,8};
        System.out.println(subarray(nums));
    }
}


/////////////KADANES ALGORITHM  OPTIMAL SOLUTION////////////
class MaxSubarray{
    public static int subarray(int[] num){
        int max_so_far = num[0];
        int curr_max = num[0];
        for(int i=0;i<num.length;i++){
            curr_max = Math.max(num[i],num[i]+curr_max);
            max_so_far = Math.max(curr_max,max_so_far);
        }
        return max_so_far;
    }
    public static void main(String[] args){
        int[] num ={-2,-5,6,-2,-3,1,5,-6};
        System.out.println(subarray(num));
    }
}
