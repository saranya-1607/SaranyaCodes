cclass divisors0f3 {
    public static void main(String[] args) {
         int n =6;int count=0;
         for(int i=1;i*i<=n;i++){
             if(n%i==0){
                 if(i%3==0)count++;
                 int pair = n/i;
                 if(pair%3==0 && pair!=i) count++;
             }
         }
         System.out.println(count);
    }
}
