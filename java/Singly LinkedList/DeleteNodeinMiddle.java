
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
    
    public static void deleteAtMiddle(int index){
        Node temp = head;
        if(index==0){
            head = head.next;
            return;
        }
        if(index<0 || head==null){
            System.out.println("Inddex not valid or list is empty");
            return;
        } 
            
        
        for(int i=0;i<index-1;i++){
            if(temp==null || temp.next==null){
                 System.out.println("Index out of range");
            return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
        
        deleteAtMiddle(0);
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
