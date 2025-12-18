import java.util.HashMap;
class longestSubarrayOfSumK{
    public static int longestSubarray(int[] arr,int k){
       HashMap<Integer,Integer> hm = new HashMap<>();
       int res=0;
       int prefSum =0;
       for(int i=0;i<arr.length;i++){
           prefSum += arr[i];
           if(hm.containsKey(prefSum-k))
               res = Math.max(res,i- hm.get(prefSum-k));
               if(!hm.containsKey(prefSum)) hm.put(prefSum,i);
           
       }
       return res;
    }
    public static void main(String[] args){
        int[] arr ={5,2,2,5,1,1,1,1,4};
        int k =4;
        System.out.println(longestSubarray(arr,k));
    }
}
