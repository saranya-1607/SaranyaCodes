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

class SetMatrix{
    public void setZeros(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(row[i]==1|| col[j]==1){
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


///////////////////OPTIMALLLL SOLUTION:::::::::::::::
class SetMatrix {

    public static void setmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Step 1: Check first row and column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0)
                firstCol = true;
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0)
                firstRow = true;
        }

        // Step 2: Mark rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3: Set zeroes using markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero first row
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 5: Zero first column
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setmatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

