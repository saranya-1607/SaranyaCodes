class  SquaresDifference {
    public static void main(String[] args){
      int n=3;
      long sumOfSquares = n*(n+1)*(2*n+1)/6;
      long squareOfSum = (long)Math.pow(n*(n+1)/2,2);
      long diff = Math.abs(squareOfSum-sumOfSquares );
      System.out.println(diff);
    }
}
