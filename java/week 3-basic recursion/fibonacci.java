class fibonacci{
    public static void main(String[] args){
        int n=7;
        System.out.println(fib(n));
    }
    public static long fib(int n){
        if(n<=1){
            return 1;
        }
        return fib((n-1)+(n-2));
    }
}
