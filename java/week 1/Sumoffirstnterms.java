class Sumoffirstnterms {
    public static void main(String[] args) {
       int n=5;
       long sum=0;
       for(long i=1;i<=n;i++){
           sum = sum+i*i*i;
       }
       System.out.println(sum);
    }
}

//OPTIMIZED SOLUTION: -
class  Sumoffirstnterms {
    public static void main(String[] args){
        int n =5;
        long sum=(long)(n*(n+1)/2);
        System.out.println(sum*sum);
    }
}

//another way:
class  Sumoffirstnterms {
    public static void main(String[] args){
        int n =5;
        long sum=(long)Math.pow((n*(n+1)/2),2);
        System.out.println(sum);
    }
}
