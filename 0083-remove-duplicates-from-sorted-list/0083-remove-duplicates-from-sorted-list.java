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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while(currNode != null){
            if(currNode.val > prevNode.val){
                prevNode = currNode;
            }
            else if(currNode.val == prevNode.val){
                prevNode.next = currNode.next;
            }
            currNode = currNode.next;
        }
        return head;
    }
}