class PerfectNumber {
    public static void main(String[] args) {
         int n =8;
         int sum =1;
         for(int i=2;i*i<=n;i++){
             if(n%i==0){
                 sum =sum+i;
                 if(n/i!=0){
                     sum =sum+n/i;
                 }
             }
         }
         if(sum==n){
             System.out.println("perfect number");
         }else{
             System.out.println("not a perfect number");
         }
    }
} 
