////////////////////////brute force////////////////////////////
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merged = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                merged.add(nums1[i++]);
            }else{
                merged.add(nums2[j++]);
            }
        }
            while(i<nums1.length){
                merged.add(nums1[i++]);

                }
            while(j<nums2.length){
                merged.add(nums2[j++]);
            }
            int n =merged.size();
            if(n % 2==1){
                return merged.get(n/2); 
            }
            return (merged.get(n/2-1) + merged.get(n/2))/2.0;
            
        }
    }
////////////////////////optimal solution////////////////////////
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 =nums1.length;
        int n2=nums2.length;
        if(n1 > n2){
            return findMedianSortedArrays(nums2,nums1);
        }

        int l=0;
        int r=n1;
        while(l<=r){
            int cut1 =(l+r)/2;
            int cut2 =(n1+n2+1)/2 - cut1;

            int l1 =(cut1==0)?Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = (cut2==0)?Integer.MIN_VALUE : nums2[cut2-1];

            int r1 = (cut1==n1)?Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2==n2) ? Integer.MAX_VALUE : nums2[cut2];

            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    return Math.max(l1,l2);
                }
              }else if(l1>l2){
                r = cut1-1;
              }else{
                l =cut1+1;
            }
        }
        return 0.0;
    }
}
