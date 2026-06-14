//TC:O9n), SC:O(1)
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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow =slow.next;
            fast =fast.next.next;
        }
        ListNode prev =null;
        ListNode curr = slow;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        int max =0;
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            max = Math.max(max,first.val+second.val);
            first = first.next;
            second = second.next;
        }
        return max;
    }
}
