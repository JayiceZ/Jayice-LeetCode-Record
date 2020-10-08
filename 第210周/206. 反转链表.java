/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null,now=head;
        while(now!=null){
            ListNode temp=now.next;
            now.next=pre;
            pre=now;
            now=temp;
        }
        return pre;
    }
}