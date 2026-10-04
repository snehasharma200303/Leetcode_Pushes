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
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode temp=head;
        int t=0;
        while(temp!=null){ t++;temp=temp.next;}
        t=t-n;
        temp=d;
        while(t>0){
            temp=temp.next;
            t--;
        }
        temp.next=temp.next.next;
         return d.next;    
    }
   
}