// BRUTE FORCE APPROACH SOLUTION : 0(N2)
class 217.Contains Duplicate{
    public static boolean dup(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] ==arr[j]){
                 return true;
                }
            }
        }
         return false;
         }
    public static void main(String[] args){
        int[] arr ={1,2,3,1};
        System.out.println(dup(arr));
    }
}

// OPTIMISED 0(N) TIME COMPLEXITY USING HASHSET:

import java.util.HashSet;
class containsDuplicates{
    public static boolean Containdups(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int key : arr){
            if(set.contains(key)){
                return true;
            }
            set.add(key);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,3,2,1};
        System.out.println(Containdups(arr));
    }
}
