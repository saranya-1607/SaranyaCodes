
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
   
    public static void reverse(){
        Node curr =head;
        Node prev = null;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            
            prev =curr;
            curr = nextNode;
            
            
        }
        head = prev;
    }
    
    public static void main(String[] args) {
        addAtInsert("A",0);
        addAtInsert("B",1);
        addAtInsert("C",2);
        printLinkedList();
        
        //deleteAtMiddle(0);
        reverse();
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
