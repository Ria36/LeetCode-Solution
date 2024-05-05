/* https://leetcode.com/problems/delete-node-in-a-linked-list/?envType=daily-question&envId=2024-05-05 */

/* 237. Delete Node in a Linked List */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next; 
    }
}
