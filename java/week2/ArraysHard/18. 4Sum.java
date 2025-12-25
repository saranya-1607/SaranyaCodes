////////////////////////////BRUTE FORCE APPROACH/////////////////////////////
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum==target){
                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
/////////////////////////////BETTER APPROACH////////////////////////////
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       int n = nums.length;
       Set<List<Integer>> ans = new HashSet<>();
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            Set<Integer> seen = new HashSet<>();
            for(int k=j+1;k<n;k++){
                long required = (long)target-nums[i]-nums[j]-nums[k];
                if(seen.contains((int)required)){
                    List<Integer> temp =Arrays.asList(nums[i],nums[j],nums[k],(int)required);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                seen.add(nums[k]);
            }
        }
       }
       return new ArrayList<>(ans);
    }
}
/////////////////////////////////OPTIMAL APPROACH////////////
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums);
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        for(int j=i+1;j<n;j++){
            if(j>i+1 && nums[j]==nums[j-1]) continue;
            
            int left = j+1;
            int right = n-1;
            while(left<right){
                long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1])left++;
                    while(left<right && nums[right]==nums[right+1])right--;

                }
               else if(sum<target) left++;
               else right--;
            }
        }
       }
       return ans;
    }
}
