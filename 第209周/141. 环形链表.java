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
        ListNode slow=head,fast=head;
        if(fast==null||fast.next==null){
            return false;
        }
        do{
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }while(fast!=null&&fast.next!=null);
        return false;
    }
}