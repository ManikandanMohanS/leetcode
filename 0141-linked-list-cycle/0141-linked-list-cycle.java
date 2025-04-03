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
    public boolean hasCycle(ListNode head) {
       //flod warshall algo


       ListNode slowPtr= head;
       ListNode fastPtr= head;

       while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null){
      
      slowPtr=slowPtr.next;//move one place

      fastPtr=fastPtr.next.next;//move two place 

      if(slowPtr==fastPtr){
        return true;
      }

       }
return false;
    }
}