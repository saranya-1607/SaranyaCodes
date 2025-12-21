////////////////////////////////////////BRUTE FORCE::::::::::::::::::::::::::::::
class SetMatrix{
    public void setZeros(int[][] matrix){
        int m= matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int col=0;col<n;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col]=-1;
                        }
                    }
                    for(int row=0;row<m;row++){
                        if(matrix[row][j]!=0){
                            matrix[row][j] =-1;
                        }
                    }
                }
            }
        }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==-1){
                        matrix[i][j]=0;
                    }
                }
            }
        }
    public static void main(String[] args){
        int[][] matrix={
            {1,1,1},
            {1,0,1},
            {1,1,1}};
        int m= matrix.length;
        int n = matrix[0].length;
        SetMatrix obj = new SetMatrix();
        obj.setZeros(matrix);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}


////////////////BETTER>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
