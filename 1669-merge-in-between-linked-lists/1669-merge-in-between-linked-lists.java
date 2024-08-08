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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //mark a position
        ListNode aMarker = list1;
        int count = 0;
        while(count != a-1){
            count++;
            aMarker = aMarker.next;
        }
        //mark b position
        count = 0;
        ListNode bMarker = list1;
        while(count != b+1){
            count++;
            bMarker = bMarker.next;
        }
        //join first half to list2
        aMarker.next = list2;
        ListNode temp = list2;
        //join remainingpart
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = bMarker;
        return list1;
    }
}