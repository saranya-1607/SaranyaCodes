///////////////////////////BRUTE FORCE/////////////////////

class Main {
    public static int singleNonDuplicate(int[] arr){
         int n = arr.length;
         if(n==1) return arr[0];
         for(int i=0;i<n;i++){
             if(i==0){
                 if(arr[i] != arr[i+1]){
                     return arr[i];
                 }
                 }else if(i==n-1){
                     if(arr[i] != arr[i-1]);
                     return arr[i];
                 }else{
                     if(arr[i] != arr[i+1] && arr[i] != arr[i-1]){
                         return arr[i];
                     }
                 }
            
         }
          return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(singleNonDuplicate(arr));
    }
}

/////////////////////////////////////OPTIMAL SOLUTION/////////////////////////////////

class Main {
    public static int singleNonDuplicate(int[] arr){
         int l=0;
         int r= arr.length-1;
         while(l<r){
             int mid=l+(r-l)/2;
             if(mid%2 == 1){
                 mid--;
             }
             if(arr[mid]==arr[mid+1]){
                l=mid+2;     
             }else{
                 r=mid;
             }
        }
        return arr[l];
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(singleNonDuplicate(arr));
    }
}
