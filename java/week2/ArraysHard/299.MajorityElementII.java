////////////BRUTE FORCE:::::::::::::::::::;;

import java.util.*;
class MajorityElementII{
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(ans.size()==0 || ans.get(0)!=nums[i] && ans.size()<2 || ans.get(1)!=nums[i]){
                int cnt =0;
                for(int j=0;j<n;j++){
                    
                    if(nums[j]==nums[i]){
                        cnt++;
                    }
                }
                if(cnt > n/3){
                    ans.add(nums[i]);
                }
            }
            if(ans.size()==2){
                break;
            }
        }
        return ans ;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 3, 1, 1, 2, 2};
        MajorityElementII obj = new MajorityElementII();
        List<Integer> ans = obj.majorityElement(nums);
        for(int res:ans){
            System.out.println(res);
        }
    }
}



////////////////BETTER SOLUTION.......
import java.util.*;
class MajorityElementII{
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans  = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        int mini =n/3+1;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])==mini){
                ans.add(nums[i]);
            }
            if(ans.size()==2) break;
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 3, 1, 1, 2, 2};
        MajorityElementII obj = new MajorityElementII();
        List<Integer> ans = obj.majorityElement(nums);
        for(int res:ans){
            System.out.println(res);
        }
    }
}

///////////////////OPTIMISED SOLUTION                   :::::::::
class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n =nums.length;
       int cnt1 = 0,cnt2 =0;
       int element1 = Integer.MIN_VALUE,element2=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(cnt1==0 && element2 !=nums[i]){
            cnt1++;
            element1 = nums[i];
        }
        else if(cnt2==0 && element1 !=nums[i]){
            cnt2++;
            element2 = nums[i];
        }
        else if(element1== nums[i]) cnt1++;
        else if(element2==nums[i]) cnt2++;
        else{
            cnt1--;
            cnt2--;
        }
       }
       cnt1=0;cnt2=0;
       for(int i=0;i<n;i++){
       if(nums[i]==element1)cnt1++;
       if(nums[i]==element2)cnt2++;
    }
    int mini =n/3+1;
    List<Integer>res = new ArrayList<>();
    if(cnt1>=mini) res.add(element1);
    if(cnt2>=mini) res.add(element2);
    return res;
    }

}






