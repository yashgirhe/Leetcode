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
        int count = 0;
        //traverse and count size
        ListNode currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            count++;
        }
        //traverse till mid and print
        int mid = count / 2;
        int i = 1;
        ListNode midNode = head;
        while (i <= mid) {
            midNode = midNode.next;
            i++;
        }
        return midNode;
    }
}