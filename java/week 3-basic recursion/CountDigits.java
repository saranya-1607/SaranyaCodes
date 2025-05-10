class CountDigits{
    public static long countd(int n){
       if(n<10){
           return 1;
       }
       return 1+countd(n/10);
    }
    public static void main(String[] args){
    int n = 123467;
      System.out.println(countd(n));
       }
} 
