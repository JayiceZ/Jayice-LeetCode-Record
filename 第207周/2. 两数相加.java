/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int next=0;
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(l1!=null||l2!=null||next!=0){
            int v1=l1==null?0:l1.val;
            int v2=l2==null?0:l2.val;
            int val=v1+v2+next;
            temp.next=new ListNode((val)%10);
            next=(val)/10;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next; 
            temp=temp.next;
        }
        return ans.next;
    }
}
