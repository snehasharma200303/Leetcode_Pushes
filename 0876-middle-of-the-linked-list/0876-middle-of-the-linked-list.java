/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     -    
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        if(head.next.next == null) return head.next;
        ListNode temp=head;
        ListNode temp2=head;
        int size=0;
        while(temp != null) {
            size++;
            temp=temp.next;
        } 
            int i=0;
            while(i++<= size%2){
                temp2=temp2.next;
            }
             if(size %2 ==0){
            return temp2.next.next;
             }
              else return temp2;
    }
}