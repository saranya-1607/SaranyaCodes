
class InsertNewElementAndReturnIndex {
    public static int bs(int[] nums,int target){
        int l=0;int r=nums.length-1;
        while(l<=r){
            int mid =(l+r)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
            
        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums ={1,3,5,7,9};
        int ans = bs(nums,11);
        System.out.println(ans);
    }
}


////////////////////////////////////////////////////////////////


class InsertNewElementAndReturnIndex {
    public static Character bs(char[] nums,char target){
        int l=0;int r=nums.length-1;
        while(l<=r){
            int mid =(l+r)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
            
        }
        if(r<0) return 'a';
        return nums[r];
    }
    public static void main(String[] args) {
        char[] nums ={'c','e','g','k'};
        char ans = bs(nums,'d');
        System.out.println(ans);
    }
}
