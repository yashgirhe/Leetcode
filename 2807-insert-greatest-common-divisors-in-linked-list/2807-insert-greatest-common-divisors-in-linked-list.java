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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        if(head.next == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        
        while(curr != null){
            int gcd = GCD(prev.val,curr.val);
            ListNode newNode = new ListNode();
            newNode.val = gcd;
            prev.next = newNode;
            newNode.next = curr;
            
            curr = curr.next;
            prev = prev.next.next;
        }
        return head;
    }
    public static int GCD(int x, int y) {
        int min = Math.min(x, y);
        int gcd = 1;

        for (int i = min; i > 1; i--) {
            if (x % i == 0 && y % i == 0) return i;
        }
        return gcd;
    }
}