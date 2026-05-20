class Main{
  
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
    public static Node addAtIndex(Node head,String data,int index){
        
        Node newNode =  new Node(data);
        if(index==0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            if(temp == null){
                System.out.println("Index out of range");
                return head;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
       Node n1 = new Node("A");
       Node n2 = new Node("B");
       Node n3 = new Node("C");
       n1.next = n2;
       n2.next = n3;
       
       Node head = n1;
       
       printLinkedList(head);
        head= addAtIndex(head,"D",0);
       printLinkedList(head);
       head=addAtIndex(head,"E",1);
       printLinkedList(head);
       head=addAtIndex(head,"F",10);
       printLinkedList(head);
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
