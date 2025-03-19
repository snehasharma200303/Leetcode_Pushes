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
        ListNode temp=head;
        ListNode S=head;ListNode t1=null;
        ListNode t2=null;
        while(temp != null){      
           S=temp;
           t2=temp;
           temp=temp.next;
           S.next=t1;
           t1=t2;
            
        }
      while( head != null && S != null){
        if(S.val !=head.val) return false;
        S=S.next;
        head=head.next;
      }  
return true;  
  }
}