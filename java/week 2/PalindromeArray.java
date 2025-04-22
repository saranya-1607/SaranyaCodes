class PalindromeArray{
    public static void main(String[] args){
        int[] arr = {1 ,3,4,3,1};
        boolean isPalindrome = true;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                isPalindrome = false;
                break;
                
            }
        }if(isPalindrome){
            System.out.println("palindrome array");
        }else{
            System.out.println("not a palindrome array");
        }
    }
}
