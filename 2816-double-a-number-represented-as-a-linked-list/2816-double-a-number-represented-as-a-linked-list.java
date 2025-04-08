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
    public ListNode doubleIt(ListNode head) {
        int c=0;
        int total=0;
        ListNode ans=new ListNode(-1);
        ListNode t=ans;
        ListNode newH=reverse(head);
        while(newH != null){
           total=newH.val*2+c;
           t.next=new ListNode(total%10);
           c=total/10;
           newH=newH.next;
           t=t.next;
        }
        if(c>0) t.next=new ListNode(c);
        return reverse(ans.next);
    }
    public ListNode reverse(ListNode head){
        ListNode t=null;
        while(head != null){
            ListNode next=head.next;
            head.next=t;
            t=head;
            head=next;
        }
        return t;
    }
}