//////////////BRUTE FOREC;::::::::::::::::::::::::


class RotateImage {
    public static int[][] rotateClockWise(int[][] matrix){
        int n = matrix.length;
        int[][] ans =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-i-1]=matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        RotateImage obj = new RotateImage();
        int[][] ans = obj.rotateClockWise(matrix);
        for(int[] row:ans){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}

//////////////OPTIMAL SOL::::::::::::::::
  
class RotateImage {
    public static void rotateClockWise(int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0;int right =n-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right]= temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        RotateImage obj = new RotateImage();
         obj.rotateClockWise(matrix);
        for(int[] row:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
