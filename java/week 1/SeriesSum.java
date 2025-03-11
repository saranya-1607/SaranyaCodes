class SeriesSum {
    public static void main(String[] args) {
        int n =5;
        int sum=0,seriesTerm=0;
        for(int i=1;i<=n;i++){
            sum =sum+i;
            seriesTerm = seriesTerm+(sum);
        }
        System.out.println(seriesTerm);
    }
}
