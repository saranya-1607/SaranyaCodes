class printArray{
    public static void pr(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        pr(arr,index+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,456,6};
        pr(arr,0);
    }
}
