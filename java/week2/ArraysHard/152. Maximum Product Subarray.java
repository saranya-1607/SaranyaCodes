////////////////////////BRUTEFORCE/////////////////
Time Complexity: O(N^2), we check the product of all possible subarrays using two nested loops.
Space Complexity: O(1), No extra space is used.

class Solution {
    public int maxProduct(int[] nums) {
        int product =nums[0];
        for(int i=0;i<nums.length;i++){
            int mul =1;
            for(int j=i;j<nums.length;j++){
                mul *= nums[j];
                product = Math.max(product,mul);
            }

        }
        return product;
    }
}
