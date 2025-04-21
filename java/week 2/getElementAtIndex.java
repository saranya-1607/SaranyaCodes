class getElementAtIndex{
    public static int getElement(int[] arr,int key){
        if(key>=0 && key<arr.length){
            return arr[key];
        }else{
            System.out.println("Invalid Index");
            return -1;
        }
    }
    public static void main(String[] args){
        int[] arr ={10,20,30,40,50};
        int key = 3;
        int result =getElement(arr,key);
        System.out.println("element at index "+key+" is :"+result);
    }
}
