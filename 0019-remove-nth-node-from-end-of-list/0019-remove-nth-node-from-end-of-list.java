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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return null;
        }
        ListNode countNode = head;
        int size=1;
        while (countNode.next != null){
            countNode = countNode.next;
            size++;
        }
        //if size is same as n
        if(size == n){
            return head.next;
        }
        //identify & delete node
        int targetPos = (size - n);
        ListNode prevNode = head;
        int i = 1;
        while (i < targetPos){
            prevNode = prevNode.next;
            i++;
        }
        ListNode targetNode = prevNode.next;
        prevNode.next = targetNode.next;
        targetNode.next = null;
        return head;
    }
}