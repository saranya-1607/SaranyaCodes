class Solution {
    public boolean isPossible(int[] arr,int k,int mid){
        int students=1;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            int val =arr[i];
            if(temp+val>mid){
                students++;
                temp = val;
                
                if(students>k){
                    return false;
                }
            }else{
                temp+=val;
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
       int l=0;
       int r=0;
       for(int pages : arr){
           l=Math.max(l,pages);
           r += pages;
       }
       int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
                
            }
        }
        return ans;
    }
}
