////////////////////////////////OPTIMAL SOLUTION////////////////////////////////

class Solution {
    int maxLength(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> ans = new HashMap<>();
        int sum =0;
        int max=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum==0){
                max =i+1;
            }
            else if(ans.get(sum)!=null){
                    max = Math.max(max,i-ans.get(sum));
                }
            else{
                ans.put(sum,i);
            }
        }
        return max;
        
  
