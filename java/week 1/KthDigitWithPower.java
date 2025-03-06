//Finds the power of A power B and then finds the kth digit of the number

class KthDigitWithPower {
    public static void main(String[] args) {
      int A=5,B=2,K=2;
      long power = (long)Math.pow(A,B);
      long i=1;
      while(power>0){
         long result = power % 10;
         if(K==i){
             System.out.println(result);
             break;
         }
         i++;
         power = power /10;
      }
      
    }
}
