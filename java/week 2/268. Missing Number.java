class 268.Missing Number{
    public static int miss(int[] nums){
        int n = nums.length;
        int total = n*(n+1)/2;
        int sum =0;
        for(int arr:nums){
            sum +=arr;
        }
        return total-sum;
    }
    public static void main(String[] args){
        int[] nums={0,1,2,3,5};
        
        System.out.println("missing number:"+miss(nums));
    }
}
