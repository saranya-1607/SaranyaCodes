//TC:O(n^2), SC:O(1)
class Solution {
    public String longestPalindrome(String s) {
       int start =0;
       int maxLen = 1;
       int n = s.length();
       for(int i=1;i<n;i++){
        //for even length
        int l = i-1;
        int r =i;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            if(r-l+1 > maxLen){
                maxLen = r-l+1;
                start =l;
            }
            l--;
            r++;
        }

        //for odd length
        l =i-1;
        r=i+1;
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            if(r-l+1 > maxLen){
                maxLen = r-l+1;
                start =l;
            }
            l--;
            r++;
        }
       }
       return s.substring(start,start+maxLen); 
    }
}
