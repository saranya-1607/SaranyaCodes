class MaxMinProduct{
    public static int maxMinProduct(int[] arr1,int[] arr2){
        if(arr1.length==0 || arr2.length==0){
            return 0;
        }
        int max = arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        int min = arr2[0];
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] < min){
                min = arr2[i];
            }
        }
        return max*min;
    }
public static void main(String[] args){
    int[] arr1 = {1,7,4,2,5};
    int[] arr2 ={1,3,6,8,4};
    int result = maxMinProduct(arr1,arr2);
    System.out.println("The produce of max in arr1 and min in arr2 is:"+result);
}
        
}
