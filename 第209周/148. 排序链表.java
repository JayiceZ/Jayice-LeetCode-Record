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
        if(head==null||head.next==null)
            return head;
        ListNode slow=head,fast=head;
        ListNode pre=null;
        while(fast!=null&&fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(pre!=null)
            pre.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        return merge(l1,l2);
    }
    private ListNode merge(ListNode l1,ListNode l2){
        ListNode ans=new ListNode(1);
        ListNode temp=ans;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null)
            temp.next=l1;
        else if(l2!=null)
            temp.next=l2;
        return ans.next;
    }
}