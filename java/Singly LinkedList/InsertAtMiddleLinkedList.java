//TC:O(n),SC:O(1)
//1. Move temp to node before insertion position.
//2. Point newNode.next to temp.next.
//3. Point temp.next to newNode.
class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
        
    }
}

class Main {
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }
    public static void addAtMiddle(Node head, String newData,int index){
        Node temp = head;
        Node newNode = new Node(newData);
        for(int i=0;i<index-1;i++){
            temp =temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    
    public static void main(String[] args) {
       Node n1 = new Node("A");
       Node n2 = new Node("B");
       Node n3 = new Node("C");
       n1.next=n2;
       n2.next=n3;
       n3.next=null;
       
       Node head =n1;
       
       printLinkedList(head);
       addAtMiddle(head,"S",2);
        printLinkedList(head);
       
    }
}
