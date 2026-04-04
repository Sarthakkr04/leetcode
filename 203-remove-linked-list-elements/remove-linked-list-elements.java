class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null) {

            if (temp.next.val == val) {
                // remove node
                temp.next = temp.next.next;
            } 
            else {
                // move pointer
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}