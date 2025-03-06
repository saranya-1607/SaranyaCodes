class Palindrome {
     public static void main(String[] args){
        int n =131;
        int sum =0;
        int x=n;
        while(n>0){
            int lastdigit = n%10;
            sum = sum*10+(lastdigit);
            n = n/10;
        }
        if(sum==x){
            System.out.println("palindrome");
        }else{
          System.out.println("not a palindrome");  
        }
    }
}
