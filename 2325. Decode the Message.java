class Solution {
    public String decodeMessage(String key, String message) {
       int temp=97;
       HashMap<Character,Character> hm = new HashMap<>();
       for(int i=0;i<key.length();i++){
        char ch=key.charAt(i);
        if(ch!=' '&& !hm.containsKey(ch)){
            hm.put(ch,(char)temp);
            temp++;
        }
       }
       String ans="";
       for(int i=0;i<message.length();i++){
        char ch=message.charAt(i);
        if(ch==' '){
            ans+=' ';
        }else{
          int tval=hm.get(ch);
          char val = (char)tval;
          ans+=val;
        }
       } 
       return ans;
    }
}
