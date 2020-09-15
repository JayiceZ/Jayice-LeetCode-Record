/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||n==0)
            return null;
        ListNode fast=head;
        while(n-->0){
            if(fast!=null)
                fast=fast.next;
            else
                return head.next;
        }
        if(fast==null)
            return head.next;
        ListNode slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
