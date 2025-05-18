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
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null) return head;
        ListNode mid=findMid(head);
        ListNode nextt=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(nextt);
        return merge(left,right);
       
    }
    public ListNode findMid(ListNode temp){
        ListNode slow=temp;
        ListNode fast=temp.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left, ListNode right){
        ListNode merged=new ListNode(-1);
        ListNode ans=merged;
        while(left != null && right!= null){
            if(left.val<=right.val) {
                ans.next=left;
                left=left.next;
                ans=ans.next;
            }
            else{
                ans.next=right;
                right=right.next;
                ans=ans.next;
            }
           
        }
        if(right != null) {
                ans.next=right;
                right=right.next;
                ans=ans.next;
        }
        if(left != null) {
            ans.next=left;
                left=left.next;
                ans=ans.next;

        }
        return merged.next;
    }
}