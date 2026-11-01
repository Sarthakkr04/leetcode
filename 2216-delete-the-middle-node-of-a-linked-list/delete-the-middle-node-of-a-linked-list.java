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

    public ListNode middle(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) { return null; }
        ListNode middle = middle(head);
        ListNode temp = head;
        while( temp.next != middle) temp = temp.next;
        temp.next = middle.next;
        return head;
        
    }
}
