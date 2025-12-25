///////////////////////BRUTE FORCE////////////////////////
import java.util.*;
class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
    
    public static void main(String args[]){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum obj = new ThreeSum();
       List<List<Integer>> res= obj.threeSum(nums);
       for(List<Integer> triplet : res){
           System.out.print(triplet+" ");
           
       }
       System.out.println();
       
        }
    }

/////////////////////////////////BETTER APPROACH /////////////////////////
import java.util.*;
class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
           HashSet<Integer> set = new HashSet<>();
           for(int j=i+1;j<n;j++){
               int third = -(nums[i]+nums[j]);
               if(set.contains(third)){
                   List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                   Collections.sort(temp);
                   ans.add(temp);
               }
               set.add(nums[j]);
           }
       }
       return new ArrayList<>(ans);
    }
    
    public static void main(String args[]){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum obj = new ThreeSum();
       List<List<Integer>> res= obj.threeSum(nums);
       for(List<Integer> triplet : res){
           System.out.print(triplet+" ");
           
       }
       System.out.println();
       
        }
    }

/////////////////////////////////////OPTIMAL APPROACH //////////////////////////////
                                   .USING TWO-POINTERS ALGORITHM.
import java.util.*;
class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      int n = nums.length;
      Arrays.sort(nums);
      for(int i=0;i<n;i++){
          if(i>0 && nums[i]==nums[i-1]) continue;
          
          int left =i+1,right=n-1;
          while(left<right){
              int sum = nums[i]+nums[left]+nums[right];
              if(sum==0){
                  ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                  left++;
                  right--;
                  while(left<right && nums[left]==nums[left-1]) left++;
                  while(left<right && nums[right]==nums[right+1])
                      right--;
              }
              else if(sum<0) left++;
              else right--;
          }
      }
      return ans;
    }
    
    public static void main(String args[]){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum obj = new ThreeSum();
       List<List<Integer>> res= obj.threeSum(nums);
       for(List<Integer> triplet : res){
           System.out.print(triplet+" ");
           
       }
       System.out.println();
       
        }
    }
