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
        ListNode t=head;
        int element=0;
        while(t!=null){
            t=t.next;
            element++;
        }
       // System.out.println(element);
        if(element==0)
          return head;
       t=head;
        if(element%2!=0){
            int mid=(element/2)+1;

               for(int i=1;i<mid;i++){
                head=head.next;
               }
        }
        else{
           int mid=(element/2)+1;
        for(int i=1;i<mid;i++){
                head=head.next;
               }

        }
        return head;
    }
}