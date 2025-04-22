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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> myList=new ArrayList<>();
       ListNode temp= head;
        while(temp!=null) {
            myList.add(temp.val);
            temp=temp.next;
        }

        Collections.sort(myList);
        temp=head;
        int index=0;
        while(temp!=null){
            temp.val=myList.get(index);
            index++;
            temp=temp.next;
        }

       return head;
    }
}