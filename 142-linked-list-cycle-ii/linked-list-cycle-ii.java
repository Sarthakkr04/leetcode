/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast ){
                ListNode pos = head;
                while( pos != fast){
                    pos = pos.next;
                    fast = fast.next;
                }
                return pos;
                
            }
        }
        return null;
        
    }
}