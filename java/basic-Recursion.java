class recursion{
    public static void recurs(int n){
        if(n==0){
            return;
        }else{
         System.out.println(n);
         recurs(n-1);
        }
    }
    public static void main(String[] args){
        recurs(5);
      
    }
}
