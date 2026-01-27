class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l=0;
        int r = m*n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int row = mid/n;
            int col = mid%n;

            int val=matrix[row][col];
            if(val==target){
                return true;
            }
            if(val>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}
