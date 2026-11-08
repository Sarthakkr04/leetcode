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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp= head;
        ListNode slow = head, fast = head;
        for(int i = 1; i <k; i++)temp = temp.next;
        int f_n = temp.val;
        for( int i =1; i <= k ; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        int l_n = slow.val;
        temp.val = l_n;
        slow.val = f_n;
        return head;

    }
}