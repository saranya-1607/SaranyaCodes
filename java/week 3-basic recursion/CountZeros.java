class CountZeros{
    public static long count(int n){
        if(n==0){
            return 0;
        }else if(n %10==0){
            return 1+count(n/10);
        }else{
            return count(n/10);
        }
        
    }
    public static void main(String[] args){
        int n = 16071106;
        System.out.println(count(n));
    }
}
