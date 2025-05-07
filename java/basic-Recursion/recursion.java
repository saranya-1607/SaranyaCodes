class recursion{
    public static void printN(int N){
        if(N==0){
            return;
        }else{
            System.out.println(N);
            printN(N-1);
        }
    }
    public static void main(String[] args){
        printN(8);
    }
}
