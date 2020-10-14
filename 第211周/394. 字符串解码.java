class Solution {
    private String s;
    private int ptr;
    public String decodeString(String s) {
        this.s=s;
        this.ptr=0;
        return getString();
    }

    private String getString(){
        if(ptr>=s.length()||s.charAt(ptr)==']'){
            return "";
        }

        String ans="";
        int time=1;
        if(Character.isDigit(s.charAt(ptr))){
            time=getNumber();
            ptr++;
            String str=getString();
            ptr++;
            while(time-->0){
                ans+=str;
            }
        }else{
            ans= String.valueOf(s.charAt(ptr++));
        }
        return ans+getString();
    }

    private int getNumber(){
        int ans=0;
        while(ptr!=s.length()&&Character.isDigit(s.charAt(ptr))){
            ans=ans*10+s.charAt(ptr++)-'0';
        }
        return ans;
    }
}