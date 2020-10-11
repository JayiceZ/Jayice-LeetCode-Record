/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=null;
        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=pre;
            pre=slow;
            slow=temp;
        }
        while(pre!=null&&head!=null){
            if(pre.val!=head.val)
                return false;
            pre=pre.next;
            head=head.next;
        }
        return true;
    }
}