class class OddDigitsCount{
  public static void main(String[] args){
    int n=2435674,count = 0;
   while(n>0){
       int ld = n%10;
       if(n%2!=0){
           count++;
       }
      n=n/10;
       }
   System.out.println(count);
  }
}
