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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        int firstVal = 0;
        int i=1;
        while(i < k){
            first = first.next;
            i++;
        }
        firstVal = first.val;
        ListNode temp = first;
        while(temp.next != null){
            second = second.next;
            temp = temp.next;
        }
        first.val = second.val;
        second.val = firstVal;
        return head;
    }
}