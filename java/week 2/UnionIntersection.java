//BRUTE FORCE APPROACH::::
import java.util.*;
class UnionIntersection{
    public static void unionintersection(int[] num1,int[] num2){
        HashSet<Integer> union = new HashSet<>();
        for(int num : num1){
            union.add(num);
        }
        for(int num :num2){
            union.add(num);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : num1){
            set1.add(num);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int num :num2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }
        System.out.println(union);
        System.out.println(intersection);
    }
    public static void main(String[] args){
        int[] num1 ={1,2,3,4,5,6};
        int[] num2 ={4,5,6,7,8,9};
        unionintersection(num1,num2);
    }
}

////////// OPTIMAL SOLUTION :::::
