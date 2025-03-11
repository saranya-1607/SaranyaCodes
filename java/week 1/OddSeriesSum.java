class OddSeriesSum {
    public static void main(String[] args) {
        int n =5;
        long sum=0,x=0;
        for(long i=1;i<=(2*n-1);i=i+2){
            sum =sum+i;
            x = x+(sum);
        }
        System.out.println(x);
    }
}
