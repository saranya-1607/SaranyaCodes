//BRUTE FORCE.............
import java.util.Arrays;
class sortColors{
    public static int[] sor(int[] arr){
       int cnt =0;
       int cnt2 =0;
       int cnt3 =0;
       for(int i=0;i<arr.length;i++){
           if (arr[i] ==0) cnt++;
           if(arr[i]==1) cnt2++;
           if(arr[i] ==2) cnt3++;
       }
       int index=0;
       for(int i=0;i<cnt;i++) arr[index++]=0;
       for(int i=0;i<cnt2;i++) arr[index++]=1;
       for(int i=0;i<cnt3;i++) arr[index++] =2;
       return arr;
    } 
    public static void main(String[] args){
        int[] arr ={2,0,2,1,1,0};
        sor(arr);
        System.out.println(Arrays.toString(arr));
    }
}


////OPTIMAL EFFICIENT SOLUTION....
USING "DUTCH NATIONAL FLAG ALGORITHM "

import java.util.Arrays;
class SortColors{
    public static int[] sort(int[] nums){
        int start =0;
        int mid =0;
        int end = nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
            swap(nums,mid,start);
            start++;
            mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,end);
                end--;
            }
            
        }
        return nums;
    }
    private static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public static void main(String[] args){
        int[] nums ={2,0,2,1,1,0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}


import java.util.Arrays;
class SortColors{
    public static int[] sort(int[] nums){
        int start =0;
        int mid=0;
        int end = nums.length-1;
        while(mid <= end){
            switch(nums[mid]){
                case 0:
                    swap(nums,start,mid);
                    start++;
                    mid++;
                case 1:
                    mid++;
                case 2:
                    swap(nums,mid,end);
                    end--;
            }
        }
        return nums;
    }
    private static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public static void main(String[] args){
        int[] nums ={2,0,2,1,1,0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
