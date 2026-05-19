//Time Complexity : O(n)
//Space Complexity : O(1)
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
    public static int LinkedListLength(Node head){
        Node temp =head;
        int count =0;
        while(temp != null){
            count++;
            temp =temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
       Node n1 = new Node("A");
       Node n2 = new Node("B");
       Node n3 = new Node("Cat");
       Node n4 = new Node("D");
       n1.next = n2;
       n2.next = n3;
       n3.next = n4;
       n4.next = null;
       
       Node head = n1;
       printLinkedList(head);
       System.out.println("Length of LL is:" + LinkedListLength(head));
    }
}
