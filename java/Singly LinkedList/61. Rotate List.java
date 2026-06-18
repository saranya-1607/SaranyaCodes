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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp =head;
        int len =1;
        while(temp.next != null){
            temp =temp.next;
            len++;
        }
        k=k%len;
        //make circular
        temp.next = head;
        int pos = len-k;

        //find new tail
        ListNode newTail = head;
        for(int i=1;i<pos;i++){
            newTail =newTail.next;
        }

        //break the circle
        ListNode newHead = newTail.next;
        newTail.next =null;

        return newHead;
    }
}
