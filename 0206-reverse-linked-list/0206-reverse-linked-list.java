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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode next;
        ListNode prev=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            if(next==null)
               break;
            prev=curr;
            curr=next;   
        }

        return curr;
    }
}