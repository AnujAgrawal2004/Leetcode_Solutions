class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        
        if(s.equals(goal)){
            Set<Character> set = new HashSet<>();
            for(char c:s.toCharArray()){
                if(set.contains(c))
                    return true;
                set.add(c);
            }
            return false;
        }
        else{
            List<Integer> AL = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!= goal.charAt(i))
                     AL.add(i);
            }
            return AL.size()==2 && s.charAt(AL.get(0))==goal.charAt(AL.get(1))&& s.charAt(AL.get(1))==goal.charAt(AL.get(0));
        }
    }
}