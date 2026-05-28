//TC:O(n),SC:O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp = head;
       int len =0;
       while(temp != null){
        len++;
        temp = temp.next;
       } 
       int pos = len-n;
       if(pos==0){
        return head.next;
       }
       temp = head;
       for(int i=0;i<pos-1;i++){
        temp = temp.next;
       }
       temp.next = temp.next.next;
       return head;
    }
}

//2nd approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode slow = head;
       ListNode fast = head;

       for(int i=0;i<n;i++){
        fast = fast.next;
       }

       if(fast == null){
        return head.next;
       }

       while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
       }
       slow.next = slow.next.next;
       return head;
    }
}
