class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0;
        int h=s.length()-1;
        while(l<h){
            char x = s.charAt(l);
            char y = s.charAt(h);
            
            if(!fun(x)) l++;
            else if(!fun(y)) h--;
            else if(x!=y) return false;
            else{
                l++;
                h--;
            }
        }
        return true;
    }
    boolean fun(char c){
        if(c>='0' && c<='9' || c>='a' && c<='z')return true;
        return false;
    }
}