import java.util.Arrays;
public class Smallestttwo{
public static Object  SmallestAndSecondSmallest (int[] arr)
{
    if(arr.length<2){
        return -1;
    }
    int Smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for(int num:arr)
    {
        if(num<Smallest){
            secondSmallest = Smallest;
            Smallest = num;
        }
        else if(num>Smallest && num<secondSmallest ){
            secondSmallest = num;
        }
    }
    if(secondSmallest == Integer.MAX_VALUE){
        return -1;
    }
    return new int[]{Smallest,secondSmallest};
}
public static void main(String[] args){
    int arr[] = { 4,2,7,1,5};
    Object result = SmallestAndSecondSmallest (arr);
    if(result instanceof int[]){
        int[] res = (int[]) result;
        System.out.println("smallest:"+res[0]);
        System.out.println("secondSmallest:"+ res[1]);
    }else{
        System.out.println(result);
    }
}
}
