class Solution {
    public boolean isPossible(int[] stalls,int k,int mid){
        int prev = stalls[0];
        k--;
        for(int i=1;i<stalls.length;i++){
            int val =stalls[i];
            if(val-prev >=mid){
                k--;
                prev =val;
            }
            if(k<=0) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int l=1;
        int r = stalls[stalls.length - 1] - stalls[0];
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(stalls,k,mid)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            
        }
        return r;
    }
}
