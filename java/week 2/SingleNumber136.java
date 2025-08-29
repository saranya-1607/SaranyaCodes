class SingleNumber136{
    public static int singleNum(int[] nums){
         int n =nums.length;
         for(int i=0;i<n;i++){
             int cnt =0;
             for(int j=0;j<n;j++){
                 if(nums[i]==nums[j]){
                     cnt++;
                 }
             }
             if(cnt==2){
                 return nums[i];
             }
         }
         return -1;
    }
    public static void main(String[] args){
        int[] nums ={2,3,4,5,5};
        System.out.println(singleNum(nums));
    }
}
