class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean flag=false;
        int idx = 0;
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target)
            {
                flag=true;
                idx=i;
                break;
            }
        }
        if(flag)
            return letters[idx];
        return letters[0];
    }
}