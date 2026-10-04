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
    public ListNode reverseList(ListNode head) {
       ListNode temp=head;
       ListNode curr=null;
       ListNode prev=head;
       while(temp!=null){        
        ListNode t1=temp;
        temp=temp.next;
        prev=curr;
        curr=t1;
        curr.next=prev;
       }
       return curr;
    }
}