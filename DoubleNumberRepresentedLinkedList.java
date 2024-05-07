/* https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/?envType=daily-question&envId=2024-05-07 */
/* 2816. Double a Number Represented as a Linked List */

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
class DoubleNumberRepresentedLinkedList {
    public ListNode doubleIt(ListNode head) {
    if (head.val >= 5)
      head = new ListNode(0, head);

    for (ListNode curr = head; curr != null; curr = curr.next) {
      curr.val *= 2;
      curr.val %= 10;
      if (curr.next != null && curr.next.val >= 5)
        ++curr.val;
    }

    return head;
    }
}
