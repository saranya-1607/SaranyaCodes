class MiddleofThree {
    public static void main(String[] args) {
       int a = 246, b = 290, c = 450;
       if(a>b && a<c || a>c && a<b){
           System.out.println(a);
       }
       else if(b>a && b<c || b>c && b<c){
           System.out.println(b);
       }else{
           System.out.println(c);
       }
    }
}
