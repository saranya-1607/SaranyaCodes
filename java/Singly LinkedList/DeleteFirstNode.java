
class Main{
static Node head;
    public static void printLinkedList(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data);
            temp =temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }
    
    public static void addAtInsert(String data,int index){
       
        Node newNode = new Node(data);
        if(index== 0){
            newNode.next =head;
            head = newNode;
            return;
        }
        Node temp =head; 
        for(int i=0;i<index-1;i++){
            if(temp ==null){
                System.out.println("Index out of range");
                return;
            }
            temp = temp.next;
            
        }
        newNode.next = temp.next;
        temp.next =newNode;
        
    }
    
    public static void main(String[] args) {
        addAtInsert("A",0);
        addAtInsert("B",1);
        addAtInsert("C",2);
        printLinkedList();
        head = head.next;
        printLinkedList();
    }
}
class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
    }
}
