/* https://leetcode.com/problems/remove-nodes-from-linked-list/?envType=daily-question&envId=2024-05-06 */
/* 2487. Remove Nodes From Linked List */

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
class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
    if (head == null)
      return null;
    head.next = removeNodes(head.next);
    return head.next != null && head.val < head.next.val ? head.next : head;
    }
}
