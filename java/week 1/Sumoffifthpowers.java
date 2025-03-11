class Sumoffifthpowers {
    public static void main(String[] args) {
       int n=2;
       long sum=0;
       for(long i=1;i<=n;i++){
           sum = sum+i*i*i*i*i;
       }
       System.out.println(sum);
    }
}

//another solution
class  Sumoffirstnterms {
    public static void main(String[] args){
        long n=3,sum=0;
        for(long i=1;i<=n;i++){
            sum =sum+ (long)Math.pow(i,5);
        }
        System.out.println(sum);
    }
}
