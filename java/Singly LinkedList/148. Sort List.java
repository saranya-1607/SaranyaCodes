//TC:O(nlogn)
//SC:O(logn) recursio stack
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode midNext = mid.next;

        //split list
        mid.next = null;

        ListNode left =sortList(head);
        ListNode right = sortList(midNext);

        return merge(left,right);
    }
    private ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode left,ListNode right){
        if(left == null) return right;
        if(right == null) return left;

        if(left.val < right.val){
            left.next = merge(left.next,right);
            return left;
        }else{
            right.next = merge(left,right.next);
            return right;
        }
    }
}
