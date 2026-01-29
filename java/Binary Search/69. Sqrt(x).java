class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int l=0;
        int r= x;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid>x){
                r=mid-1;
            }else{
                l=mid+1;
          
          }
        }
        return r;
    }
}
