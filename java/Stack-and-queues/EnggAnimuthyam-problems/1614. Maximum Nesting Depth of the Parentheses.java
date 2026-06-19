class Solution {
    public int maxDepth(String s) {
        Stack<Character> res =new Stack<>();
        int ans =0;
        for(int i=0;i<s.length();i++){
           char ch =s.charAt(i);
           if(ch=='('){
            res.push(ch);
           }else if(ch==')'){
            res.pop();
           }
           ans=Math.max(ans,res.size());
        }
        return ans;
    }
}
