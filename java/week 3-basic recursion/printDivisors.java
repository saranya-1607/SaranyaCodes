class printDivisors{
    public static int printdivisor(int n,int i){
        if(i>n){
            return n;
        }
        if(n%i==0){
            System.out.println(i);
        }
        return printdivisor(n,i+1);
    }
    public static void main(String[] args){
        int n =6;
        printdivisor(n,1);
    }
}
