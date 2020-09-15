class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if(stack.size()==0)
                return false;
            else if(c==')'){
                char last=stack.pop();
                if(last!='(')
                    return false;
            }else if(c=='}'){
                char last=stack.pop();
                if(last!='{')
                    return false;
            }else{
                char last=stack.pop();
                if(last!='[')
                    return false;
            }
        }
        return stack.size()==0;
    }
}
