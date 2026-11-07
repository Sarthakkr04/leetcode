
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode curr = temp;
        while( curr.next != null && curr.next.next != null){
            ListNode first = curr.next; // 1
            ListNode sec = curr.next.next; //2
            first.next = sec.next; //1 -> 3
            sec.next = first; // 2-> 1
            curr.next = sec;

            curr = first;
        }
        return temp.next;
    }
}