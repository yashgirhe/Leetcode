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
    //using stack
    public boolean isPalindrome(ListNode head){
        Stack<Integer> stack = new Stack();
        ListNode curr = head;
        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null && curr.val == stack.pop()){
            curr = curr.next;
        }
        return curr == null;
    }
    //using list
    // public boolean isPalindrome(ListNode head) {
    //     ArrayList<Integer> list = new ArrayList();
    //     ListNode currNode = head;
    //     while(currNode != null){
    //         list.add(currNode.val);
    //         currNode = currNode.next;
    //     }
    //     int l = 0;
    //     int r = list.size()-1;
    //     while(l<=r){
    //         if(list.get(l) != list.get(r)) return false;
    //         l++;
    //         r--;
    //     }
    //     return true;
    // }

    // public ListNode findMiddle(ListNode head){
    //     ListNode hare = head;
    //     ListNode turtle = head;
    //     while(hare.next != null && hare.next.next != null){
    //         hare = hare.next.next;
    //         turtle = turtle.next;
    //     }
    //     return turtle;
    // }
    
    // public ListNode reverseList(ListNode head){
    //     ListNode prevNode = head;
    //     ListNode currNode = head.next;
    //     while(currNode != null){
    //         ListNode nextNode = currNode.next;
    //         currNode.next = prevNode;
    //         prevNode = currNode;
    //         currNode = nextNode;
    //     }
    //     head.next = null;
    //     head = prevNode;
    //     return head;
    // }
    
    // public boolean isPalindrome(ListNode head) {
    //     if(head == null || head.next == null){
    //         return true;
    //     }
    //     ListNode middle = findMiddle(head);
    //     ListNode secondHalfStart = reverseList(middle.next);
    //     ListNode firstHalfStart = head;
    //     while(secondHalfStart != null){
    //         if(firstHalfStart.val != secondHalfStart.val){
    //             return false;
    //         }
    //         firstHalfStart = firstHalfStart.next;
    //         secondHalfStart = secondHalfStart.next;
    //     }
    //     return true;
    // }
}