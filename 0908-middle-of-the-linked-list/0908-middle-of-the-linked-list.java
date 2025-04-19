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
    public ListNode middleNode(ListNode head) {
        ListNode t = head;
        int element = 0;
        
        while (t != null) {
            t = t.next;
            element++;
        }
        
        int mid = (element / 2); // No +1 needed if you start counting from 0
        
        for (int i = 0; i < mid; i++) {
            head = head.next;
        }
        
        return head;
    }
}
