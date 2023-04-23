// class Solution {
//     public String categorizeBox(int l, int w, int h, int m) {
//         boolean isBulky = false;
//         boolean isHeavy = false;
//         long volume = l*w*h;
//         if(l>=10000 || w>=10000 || h>=10000 || volume>= 1000000000)
//             isBulky = true;
//         if(m>=100)
//             isHeavy = true;
        
//         if(isBulky && isHeavy)
//             return "Both";
//         if(isBulky == true && isHeavy == false)
//             return "Bulky";
//         if(isBulky == false && isHeavy == true)
//             return "Heavy";
//         return "Neither";
//     }
// }



class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long)length*width*height;
        boolean b =false;
        boolean h = false;
        if(length>=10000 || width >= 10000 || height >=10000 || vol>=1000000000)
        {
            b=true;
        }
        if(mass>=100)
        {
            h=true;
        }
        if(b && h)
            return "Both";
        else if (b==false && h==false)
            return "Neither";
        else if (b==true)
            return "Bulky";
        else
            return "Heavy";
    }
}