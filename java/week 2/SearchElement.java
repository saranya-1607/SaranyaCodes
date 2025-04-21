class SearchElement{
    public static void main(String[] args){
        int[] arr = {12,4,7,88,99,33,7};
        int n = arr.length;
        int x=7;
        int flag =-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
               flag =i;
               break;
            }
        }
        
        System.out.println(flag);
    }
}
