////////////////////////////optimal solution//////////////////////////////
class Solution {
    public boolean isPossible(int[] nums,int k,int mid){
        int temp=0;
       
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>mid){
                return false;
            }
            if(temp+val >mid){
                k--;
                temp=0;
            }
            temp += val;
            if(k<=0) {
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r =(int)Math.pow(10,9);
        while(l<=r){
            int mid =l+(r-l)/2;
            if(isPossible(nums,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
            
        }
        return l;

    }
}
