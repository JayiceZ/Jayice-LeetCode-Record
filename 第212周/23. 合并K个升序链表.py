# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        if not lists:return
        return self.mergeHelper(lists,0,len(lists)-1)

    def mergeHelper(self,lists,left,right):
        if left==right:
            return lists[left]
        mid=left+(right-left)/2
        l1=self.mergeHelper(lists,left,mid)
        l2=self.mergeHelper(lists,mid+1,right)
        return self.merge(l1,l2)

    def merge(self,l1,l2):
        if not l1:return l2
        if not l2:return l1
        if l1.val<l2.val:
            l1.next=self.merge(l1.next,l2)
            return l1
        else:
            l2.next=self.merge(l1,l2.next)
            return l2

