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
        int A=0,B=0;
          ListNode t2=headB;
        while(t1 != null){
            A++;
            t1=t1.next;
        }
        while(t2 != null){
            B++;
            t2=t2.next;
        }
        t1=headA;t2=headB;
        if(A>B){
            int diff=A-B;
            while(diff-- >0) t1=t1.next;
        }
        else {
            int diff=B-A;
            while(diff-- > 0) t2=t2.next;
        }
        while(t1 != null && t2 != null){
            if (t1 == t2) return t1;
            t1 = t1.next;
            t2 = t2.next;
        }
        return null;
    }
}