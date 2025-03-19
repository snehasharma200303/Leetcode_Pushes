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
      ListNode slow=head,fast=head;
      while(fast != null && fast.next != null){
        fast=fast.next.next;
        slow=slow.next;
      }
      ListNode SecHalf=reverse(slow);
      ListNode temp=head;
      while(SecHalf != null){
        if(temp.val != SecHalf.val) return false;
        temp=temp.next;
        SecHalf=SecHalf.next;
      }
      return true;
  }
  public ListNode reverse(ListNode head){
    ListNode prev=null;
    while(head != null){
        ListNode temp=head.next;
        head.next=prev;
        prev=head;
        head=temp;
    }
    return prev;
  }
}