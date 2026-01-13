////////////////////////////BRUTE FORCE////////////////////
class Solution {
    public int reversePairs(int[] nums) {
      int cnt=0;
      for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i] > 2L*nums[j]){
                cnt++;
            }
        }
      } 
      return cnt; 
    }
}

/////////////////////////////////OPTIMAL SOLU////////////////
class Solution {
    public int reversePairs(int[] nums) {
      if(nums== null || nums.length==0) return 0;
      return mergeSort(nums,0,nums.length-1);
    }
       private int mergeSort(int[] nums,int low,int high ){
        int cnt=0;
          if(low < high){
            int mid = (low+high)/2;
            cnt += mergeSort(nums,low,mid);
            cnt += mergeSort(nums,mid+1,high);
            cnt += countPairs(nums,low,mid,high);
            merge(nums,low,mid,high);
          }
          return cnt;
       }
       private int countPairs(int[] nums,int low,int mid,int high){
        int cnt=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]>2L*nums[j]){
                j++;
            }
            cnt += (j-(mid+1));
        }
        return cnt;
       }
       private void merge(int[] nums,int low,int mid,int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] L = new int[n1];
        int[] R =new int[n2];
        for(int i=0;i<n1;i++) L[i]=nums[low+i];
        for(int j=0;j<n2;j++) R[j]=nums[mid+1+j];
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                nums[k] =L[i];
                i++;
            }else{
                nums[k] =R[j];
                j++;
            }
            k++;
        }
        
       
       while(i < n1){
            nums[k] =L[i];
            i++;
            k++;
       }
       while(j<n2){
        nums[k] = R[j];
        j++;
        k++;
       }
       }
}
