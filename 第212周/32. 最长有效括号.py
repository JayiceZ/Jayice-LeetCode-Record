class Solution(object):
    def longestValidParentheses(self, s) :
        n=len(s)
        if n==0:
            return 0
        stack=[-1]
        ans=0
        for i in range(n):
            if s[i]=="(":
                stack.append(i)
            else:
                stack.pop()
                if not stack:
                    stack.append(i)
                else:
                    ans=max(ans,i-stack[-1])
        return ans
