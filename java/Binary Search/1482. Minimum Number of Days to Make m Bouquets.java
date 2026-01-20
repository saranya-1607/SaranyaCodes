////////////////////////////////////optimal solution//////////////////////


class Main {
    public static boolean isPossible(int[] bloomDay,int m,int k,int day){
        int took=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                took++;
            }else{
                took=0;
            }
            if(took==k){
                m--;
                took=0;
            }
            if(m==0) return true;
        }
        return false;
    }
    public static int minDay(int[] bloomDay,int m,int k){
        int l=1;
        int tempr = (int)Math.pow(10,9);
        int r=tempr;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
            if(l== tempr+1){
                return -1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
       int[] bloomDay = {7,7,7,7,12,7,7};
       int m = 2, k = 3;
       System.out.println(minDay(bloomDay,m,k));
    }
}
//////////////////////////////BRUTE FORCE/////////////////////////////
SEE AND APPROCH IT IN STRIVER SDE SHEET.
