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
        //single loop
        ListNode turtle = head;
        ListNode hare = head;
        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
        
        //2 loop
        // int count = 0;
        // ListNode currNode = head;
        // while (currNode != null) {
        //     currNode = currNode.next;
        //     count++;
        // }
        // int mid = count / 2;
        // int i = 1;
        // ListNode midNode = head;
        // while (i <= mid) {
        //     midNode = midNode.next;
        //     i++;
        // }
        // return midNode;
    }
}