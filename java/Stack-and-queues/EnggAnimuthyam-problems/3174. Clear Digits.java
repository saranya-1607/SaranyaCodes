//approach:1
class Solution {
    public String clearDigits(String s) {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
//approach2:
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st =new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                st.push(ch);
            }else{
                st.pop();
            }
           
           }
           
           while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
