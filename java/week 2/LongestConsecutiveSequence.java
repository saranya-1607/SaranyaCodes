/////////////BRUTE FORCE///////////
class longestLength{
    public static int longestlength(int[] nums){
        int longest =1;
        int n = nums.length;
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int cnt =1;
            while(linearSearch(nums,x+1)){
                x =x+1;
                cnt =cnt+1;
            }
            longest =Math.max(longest,cnt);
        }
        return longest;
    }
    private static boolean linearSearch(int[] a,int num){
        int n =a.length;
        for(int i=0;i<n;i++){
            if(a[i]==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums ={0,1,9,6,5,-1};
        System.out.println(longestlength(nums));
    }
}

//////OPTIMAL SOLUTION USING HASHMAP::
import java.util.HashMap;
class  longestLength{
    public static int longestlength(int[] nums){
        int longest =0;
        HashMap<Integer,Boolean> exploreMap = new HashMap<>();
        for(int num :nums){
            exploreMap.put(num,Boolean.FALSE);
        }
        for(int num :nums){
            int currLength =1;
            int nextNum =num+1;
            while(exploreMap.containsKey(nextNum) && exploreMap.get(nextNum)==false){
                currLength++;
                exploreMap.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            int prevNum = num-1;
            while(exploreMap.containsKey(prevNum) && exploreMap.get(prevNum)==false){
                currLength ++;
                exploreMap.put(prevNum,Boolean.TRUE);
                prevNum--;
            }
            longest = Math.max(longest,currLength);
            
        }
        return longest;
    }
    public static void main(String[] args){
        int[] nums={0,1,9,6,5,-1};
        System.out.println(longestlength(nums));
    }
}
