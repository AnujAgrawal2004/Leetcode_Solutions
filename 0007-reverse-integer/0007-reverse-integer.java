class Solution {
    public int reverse(int x) {
         if(x<10&&x>-10)
            return x;
        boolean isNegative=(x<0) ? true:false;
        if(isNegative)
            x=x*-1;
        
        int reverse=0,lastreverse=0;
        while(x>0)
        {
            lastreverse = reverse;
            reverse = reverse*10 + x%10;
            if(lastreverse>reverse/10)
                return 0;
            x = x/10;
        }
        if(isNegative)
            return reverse*-1;
        return reverse;
    }
}