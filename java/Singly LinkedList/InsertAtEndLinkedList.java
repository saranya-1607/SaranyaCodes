//TC:o(N),sc:O(1)
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
    
   public static void addAtEnd(Node head ,String newData){
       Node newNode = new Node(newData);
       Node temp = head;
       while(temp.next != null){
           temp=temp.next;
       } d
       temp.next = newNode;
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
      addAtEnd(head,"E");
       printLinkedList(head);//after upddate
      
    }
}
