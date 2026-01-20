//////////////////////////brute force//////////////////////////
 int n=nums.length;
       if(n==0) return 0;
       if(nums[0] > nums[1]) return nums[0];
       for(int i=1;i<n-1;i++){
        if(nums[i]>nums[i-1] && nums[i]> nums[i+1]){
            return i;
        }
       }
       if(nums[n-1]>nums[n-2]) return n-1;
       return -1;

///////////////////////////////optimal solution/////////////////////////
class Solution {
    public int findPeakElement(int[] nums) {
      int l=0;
      int r=nums.length-1;
      while(l<r){
        int mid =l+(r-l)/2;
        if(nums[mid]>nums[mid+1]){
            r=mid;
        }else{
            l=mid+1;
        }
      }
      return l;
    }
}
