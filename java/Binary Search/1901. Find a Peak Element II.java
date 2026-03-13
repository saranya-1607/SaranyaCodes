TC: O(NxM)

  class Solution {
    public int[] findPeakGrid(int[][] mat) {
      int m=mat.length;
      int n=mat[0].length;
      int l=0;
      int r=n-1;
      while(l<=r){
        int mid = (l+r)/2;

        int maxRow =0;
        for(int i=0;i<m;i++){
            if(mat[i][mid]>mat[maxRow][mid]){
                maxRow=i;
            }
        }
        int left = (mid>0)? mat[maxRow][mid-1]:-1;
        int right=(mid<n-1)?mat[maxRow][mid+1]:-1;
        if(mat[maxRow][mid]>left && mat[maxRow][mid]>right){
            return new int[]{maxRow,mid};
        }  
        else if(right>mat[maxRow][mid]){
            l=mid+1;
        }else{
            r=mid-1;
        }
      }
      return new int[]{-1,-1};
    }
}
