import java.util.*;
class Main {
    public static List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstRow =  new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        
        for(int i=1;i<n;i++){
            List<Integer>tempRow = new ArrayList<>();
            tempRow.add(1);
            for(int j=1;j<i-1;j++){
                int val = ans .get(i-1).get(j)+ans.get(i-1).get(j-1);
                tempRow.add(val);
            }
            tempRow.add(1);
            ans.add(tempRow);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print(generate(6));
       
    }
}
