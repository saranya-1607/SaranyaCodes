class Main{
  public static void main(String[] args){
    int n=1234554;
    while(n>0){
        int lastd = n%10;
        System.out.println(lastd);
        n=n/10;
    }
      
  }
}
