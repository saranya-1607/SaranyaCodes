class PrimeNumber {
     public static void main(String[] args){
       int n =6;
       boolean isPrime = true;
       for(int i=2;i<=n;i++){
           if(n%i!=0){
               isPrime =false;
               break;
           }
       }
       if(isPrime){
           System.out.println(n + " is a prime number");
       }
       else{
            System.out.println(n+" is not prime number");
       }
    }
}

//primenumber till N:-


class PrimeNumber {
     public static void main(String[] args){
      int n =30;
      for(int i=2;i<=n;i++){
          int flag =0;
          for(int j=2;j<i;j++){
              if(i%j==0){
                flag =1;
              }
          }
          if(flag==0){
              System.out.println(i);
          }
      }
    }
}
