
///////////////////////////////////////OPTIMAL SOLUTION//////////////////
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int[] current = intervals[0];
        result.add(current);

        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(next[0]<=current[1]){
                current[1]=Math.max(current[1],next[1]);
            }else{
                current = next;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
