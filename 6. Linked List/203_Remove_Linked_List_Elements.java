'''
Description
LeetCode solution to 203. Remove Linked List Elements

Website Link: https://leetcode.com/problems/remove-linked-list-elements/description/

@author: JW
'''

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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)   return head;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode front = head;
        ListNode back = dummyNode;
        while (front != null) {
            if (front.val == val) {
                back.next = front.next;
                front.next = null;
                front = back.next;
            } else {
                front = front.next;
                back = back.next;
            }
        }

        return dummyNode.next;
    }
}