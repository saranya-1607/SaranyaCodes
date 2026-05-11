//optimal: TC:O(N), SC:O(1)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans ="";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }else{
                ans += first.charAt(i);
            }
        }
        return ans;
    }
}




class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix =prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
