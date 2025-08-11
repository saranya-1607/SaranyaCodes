class sumArray{
    public static int sumarr(int[] arr,int n,int i){
        if(i>=n){
            return 0;
        }
        return arr[i]+sumarr(arr,n,i+1);
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,5,10};
        int n = arr.length;
        System.out.println(sumarr(arr,n,0));
    }
}
