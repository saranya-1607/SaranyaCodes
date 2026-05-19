//TC:O(n),SC:O(1)

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
    
   public static Node addAtStart(Node head ,String newData){
       Node newNode = new Node(newData);
       newNode.next =head;
       head =newNode;
       return head;
   }
    
    public static void main(String[] args) {
       Node n1 = new Node("A");
       Node n2 = new Node("B");
       Node n3 = new Node("C");
       Node n4 = new Node("D");
       n1.next = n2;
       n2.next = n3;
       n3.next = n4;
       n4.next = null;
       
       
       Node head = n1;
       printLinkedList(head);//before update 
      head = addAtStart(head,"HELLO");
       printLinkedList(head);//after upddate
      
    }
}
