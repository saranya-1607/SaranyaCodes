class secondLargest{
    public static int find2ndlargest(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        int[] arr ={2,4,66,788,9999,7777,888};
        int result = find2ndlargest(arr);
        System.out.println("Second largest number is:"+result);
    }
}
