class Solution {
    public boolean isPossible(int[] arr,int k,int mid){
        int painters=1;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            if(val>mid){
                return false;
            }
            if(temp+val>mid){
                painters++;
                temp=val;
                if(painters>k) return false;
            }
                else{
                    temp+=val;
                }
            
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        int l=Arrays.stream(arr).max().getAsInt();
        int r=Arrays.stream(arr).sum();
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(arr,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
