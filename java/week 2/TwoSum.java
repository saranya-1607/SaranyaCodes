//BRUTE FORCE APPROACH...

class TwoSum {
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5,8};
        int n = nums.length;
        int target =7;
        boolean found = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("numbers:"+ nums[i]+"and "+nums[j]);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("not found");
            }
        }
    }
}

// OPTIMISED HASHMAP SOLUTION 0(N)

