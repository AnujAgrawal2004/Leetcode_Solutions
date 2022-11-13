class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String str[]=s.split(" ");
        String s1=new String("");
        for(int i=0;i<str.length;i++)
            str[i]+=" ";
        for(int i=str.length-1;i>=0;i--)
        {
           if(str[i].equals(" "))
                continue;
            s1+=str[i];
            
        }
        return s1.trim();
    }
}