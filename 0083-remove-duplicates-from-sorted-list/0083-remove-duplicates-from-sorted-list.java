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
        ListNode currNode =prevNode.next;
        ArrayList<Integer> al = new ArrayList();
        al.add(prevNode.val);
        while(currNode != null){
            if(al.contains(currNode.val)){
                prevNode.next = currNode.next;
            }
            else{
                al.add(currNode.val);
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
        return head;
    }
}