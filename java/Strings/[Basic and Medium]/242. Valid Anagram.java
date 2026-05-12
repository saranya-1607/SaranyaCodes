//brute force :
// TC:O(nlogn), SC: O(n)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;   
    }
   char[] a = s.toCharArray();
   char[] b = t.toCharArray();
   Arrays.sort(a);
   Arrays.sort(b);
   return Arrays.equals(a,b);

    }
}

////////////////////////////////optimal////////////////////////////////////////
//TC:O(n), SC:O(1)
USING BUCKET ALGORITHM......
  class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        //convertboth strings to lowercase to ignore match
        s = s.toLowerCase();
        t = t.toLowerCase();
        // initialize bucket
        int[] counts = new int[26];
        //fill the bucket
        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
        }
        //empty bucket
        for(int i=0;i<t.length();i++){
            counts[t.charAt(i)-'a']--;
        }
       //check all bucket is empty ornot
        for(int count : counts){
            if(count != 0){
                return false;
            }
        }
        return true;

    }
}
