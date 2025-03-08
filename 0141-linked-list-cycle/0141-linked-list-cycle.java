/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> list=new ArrayList<>();
        ListNode slow=head;
      while(slow != null){
        if(list.contains(slow)) return true;
       list.add(slow);
       slow=slow.next;
      }
      return false;
    } 
}
