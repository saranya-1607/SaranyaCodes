class findTarget{
    public static int targetValue(int[] arr,int i,int target){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
            return targetValue(arr,i+1,target);
        }        
    }
    public static void main(String[] args){
        int[] arr ={5,7,9,25,89};
        int target=89;
        int res=targetValue(arr,0,target);
        if(res!=-1){
            System.out.print(res);
        }
        else{
            System.out.println("Target not found");
        }
    }
}
