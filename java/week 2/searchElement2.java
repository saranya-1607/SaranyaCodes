class searchElement2{
    public static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
          if(arr[i]==x){
              return i;
          }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = { 12,13,14,66,777,88};
        int x = 777;
        int index = search(arr,x);
        if(index!=-1){
            System.out.println("Element found at index:"+index);
        }else{
            System.out.println("Element not found");
        }
    }
}
