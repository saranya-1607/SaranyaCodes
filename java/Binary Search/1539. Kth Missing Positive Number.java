class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int missing = arr[mid]-(mid+1);
            if(missing < k){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l+k;
    }
}



//////////////////////////////////////////////////////
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int missingCnt =0;
        int num =1;
        int i=0;
        while(true){
            if(i<n && arr[i]==num){
                i++;
            }else{
                missingCnt++;
                if(missingCnt==k){
                    return num;
                }
            }
            num++;
        }
    }
}
