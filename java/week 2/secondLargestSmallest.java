class secondLargestSmallest{
    public static int[] secondLargestSmallest(int[] arr){
        int n =arr.length;
        int largest = arr[0];
        int slargest = -1;
        for(int i=1;i<n;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]< largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        int smallest =arr[0];
        int ssmallest =Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i]<smallest){
                ssmallest = arr[i];
            }
        }
        return new int[] {slargest,ssmallest};
    }
    public static void main(String[] args){
        int[] arr ={2,3,4,5,61,1,70};
        int[] result = secondLargestSmallest(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
