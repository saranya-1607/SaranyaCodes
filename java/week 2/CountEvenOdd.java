class CountEvenOdd {
    public static void main(String[] args) {
    int even=0,odd=0;
      int arr[] = {1,2,3,4,5};
       for(int i=0;i<=arr.length-1;i++){
           if(arr[i]%2 == 0){
               even ++;
           }else {
               odd++;
           }
       }
        System.out.println("even count:"+even);
        System.out.println("odd count:"+odd);
    }
}
