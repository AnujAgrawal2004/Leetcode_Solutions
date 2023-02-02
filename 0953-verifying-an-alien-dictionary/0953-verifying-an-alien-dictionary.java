class Solution {
    public boolean isAlienSorted(String[] words, String order) {
       HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<order.length();i++){
            char ch=order.charAt(i);
            map.put(ch,i);
        }
        for(int i=0;i<words.length-1;i++){
            String s1 = words[i];
            String s2 = words[i+1];
            boolean temp=check(s1,s2,map);
            if(temp==false)
                return false;
        }
        return true;
    }
    public boolean check(String s1,String s2,HashMap<Character,Integer> map){
        int i=0;
        while(i<s1.length() && i<s2.length()){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(map.get(ch1)>map.get(ch2))
                return false;
            if(map.get(ch1)<map.get(ch2))
                return true;
            i++;
        }
        if(i<s1.length() && i>=s2.length())
            return false;
        else
            return true;
    }
}