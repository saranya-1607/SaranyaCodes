//////////////////////////OPTIMAL APPROACH////////////////////
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int prefixXor =0;
        int cnt =0;
        for(int num:arr){
            prefixXor ^= num;
            int target = prefixXor ^ k;
            if(freq.containsKey(target)){
                cnt += freq.get(target);
            }
            freq.put(prefixXor,freq.getOrDefault(prefixXor,0)+1);
        }
        return cnt;
    }
}
