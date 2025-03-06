class reverseNumber {
     public static void main(String[] args){
        int n=325345;
        int rev_num =0;
        while(n>0){
            int last_digit = n%10;
            rev_num=rev_num*10+(last_digit);
            n = n/10;
        }
        System.out.println(rev_num);
    }
}
