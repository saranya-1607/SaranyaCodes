
class ArraySorted {
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
           if(isSorted(arr)){
              System.out.println("Array is sorted");
           } else{
               System.out.println("Array is not sorted");
           }
    }
}
