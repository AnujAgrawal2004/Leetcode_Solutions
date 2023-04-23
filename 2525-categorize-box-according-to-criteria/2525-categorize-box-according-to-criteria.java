class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        boolean isBulky = false;
        boolean isHeavy = false;
        long volume = (long) l*w*h;
        if(l>=10000 || w>=10000 || h>=10000 || volume>= 1000000000)
            isBulky = true;
        if(m>=100)
            isHeavy = true;
        
        if(isBulky && isHeavy)
            return "Both";
       else if(isBulky == true && isHeavy == false)
            return "Bulky";
       else if(isBulky == false && isHeavy == true)
            return "Heavy";
        return "Neither";
    }
}



