
class Main {
    public static int leftMost(int[] nums,int target){
        int l=0;
        int r = nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>= target){
                r = mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public static int maximumCount(int[] nums){
        int neg = leftMost(nums,0);
        int one =leftMost(nums,1);
        int pos = nums.length-one;
        return Math.max(pos,neg);
    }
    public static void main(String[] args) {
      int[] nums ={-2,-1,-1,1,2,3};
      System.out.println(maximumCount(nums));
    }
}
