class checkIfArrayIsSorted{
    public static boolean boom(int[] nums){
         int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1]){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums ={2,4,6,78,1};
       
        System.out.println(boom(nums));
    }
}
