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
 class Solution{
public ListNode rotateRight(ListNode head, int n) {
    if (head == null || head.next == null || n == 0) return head;

    // Step 1: Find the length of the list
    int length = 1; // start with 1 to include the head
    ListNode tail = head;
    while (tail.next != null) {
        tail = tail.next;
        length++;
    }

    // Step 2: Make the list circular
    tail.next = head; // connect tail to head to form a circle

    // Step 3: Find the new tail: (length - n % length - 1) steps from head
    int stepsToNewTail = length - n % length;
    ListNode newTail = head;
    for (int i = 1; i < stepsToNewTail; i++) {
        newTail = newTail.next;
    }

    // Step 4: Set the new head and break the loop
    ListNode newHead = newTail.next;
    newTail.next = null; // break the circle

    return newHead;
}
 }