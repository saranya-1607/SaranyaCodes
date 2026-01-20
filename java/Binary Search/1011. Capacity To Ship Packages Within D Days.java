class Solution {
    public boolean isPossible(int[] weights,int days,int capacity){
        int temp=0;
        for(int i=0;i<weights.length;i++){
            int val = weights[i];
            if(val > capacity) return false;
            if(temp+val > capacity){
                days--;
                temp=0;
            }
            temp += val;
            if(days<=0){
            return false;
            }    
        }
        
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(weights,days,mid)){
                r = mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
