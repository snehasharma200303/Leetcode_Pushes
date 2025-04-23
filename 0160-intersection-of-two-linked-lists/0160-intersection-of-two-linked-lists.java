/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        int A=headA.size();
        int B=headB.size();
        ListNode t2=headB;
        while(t1 != null && t2!=null){
            while(A != B){
                if(A>B) t1=t1.next;
                else t2=t2.next;
            }
            if(t1==t2) return t1;
            t1=t1.next;
            t2=t2.next;
        }
        return null;
    }
}