import java.util.*;
class FactorialList{
    public static ArrayList<Integer> fact(int n){
        ArrayList<Integer> digits = new ArrayList<>();
        int facto =1;
        for(int i=2;i<=n;i++){
            facto *= i;
        }
        if(facto==0){
            digits.add(0);
        }else{
            while(facto>0){
                digits.add(0,facto%10);
                facto /=10;
            }
        }
        return digits;
    }
    public static void main(String[] args){
            System.out.println(fact(6));
            System.out.println(fact(5));
    }
}
