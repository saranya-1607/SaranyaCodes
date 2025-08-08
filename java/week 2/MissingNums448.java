import java.util.*;
class MissingNums448{
    public static List<Integer> disappearednums(int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int arr : nums){
            set.add(arr);
        }
        ArrayList<Integer> missingList = new ArrayList<Integer>();
        for(int i=1;i<+n;i++){
        if(!set.contains(i)){
            missingList.add(i);
        }
    }
    return missingList;
    }
    public static void main(String[] args){
        int[] nums = {1,2,4,6,5,9,6,6,6};
        System.out.println(disappearednums(nums));
    }
}
