class linearSearch{
    public static int search(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==n){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={3,21,4,67,43,23,7};
        int n = 7;
        int ans = search(arr,n);
        System.out.println(ans);
    }
}
