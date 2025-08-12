class CheckifArrayisSortedandRotated {
    public static boolean check(int[] arr){
        int n =arr.length;
        int breaks =0;
        for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1)%n]){
                breaks++;
            }
        }
        return breaks<=1;
    }
    public static void main(String[] args) {
        int[] arr ={2,1,3,4};
        System.out.println(check(arr));
    }
}
