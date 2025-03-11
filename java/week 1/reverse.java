class  reverse{
    public static void main(String[] args){
      int n=200;
      int reversed =0;
     while(n>0){
        int rev = n%10;
         reversed = reversed*10+rev;
         n = n/10;
     }
      System.out.print(reversed);
   }
}
