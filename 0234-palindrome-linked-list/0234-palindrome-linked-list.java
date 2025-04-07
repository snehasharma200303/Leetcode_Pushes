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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode s= reverse(slow);
      ListNode  f=head;
        while(s != null){
            if(s.val != f.val) return false;
            s=s.next;
            f=f.next;
        }
        return true;

    }
    public ListNode reverse(ListNode slow){
       ListNode temp=null;
        while(slow != null){
            ListNode t=slow.next;
            slow.next=temp;
            temp=slow;
            slow=t;
        }
        return temp;
    }
}