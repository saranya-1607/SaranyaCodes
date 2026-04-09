brute force::
  TC: O(N^2)
  SC: O(1)
class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    cnt++;
                }
            }
        
        }
        return cnt;
    }
    private boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
