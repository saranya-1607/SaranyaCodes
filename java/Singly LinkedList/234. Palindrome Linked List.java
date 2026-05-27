//brute force
//TC:O(n), SC:O(n)
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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ls = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            ls.add(temp.val);
            temp = temp.next;
        }
        int l=0,r=ls.size()-1;

        while(l < r){
            if(ls.get(l).equals(ls.get(r))){
                return true;
            }
        }
        return false;
    }
}

//optimal
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse second half
        ListNode secondHalf = reverse(slow);
        
        //compare
        ListNode firstHalf = head;

        while(secondHalf != null){
            if(secondHalf.val != firstHalf.val){
                return false;
            }
            firstHalf =firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;

            curr.next = prev;
            prev =curr;
            curr = nextNode;
        }
        return prev;
    }
}
  
