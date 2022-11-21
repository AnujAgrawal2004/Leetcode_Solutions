public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int count=0,mask=1;
        for(int i=0;i<32;i++){
            if((n&mask)!=0)
                count++;
            mask<<=1;
        }
        return count;
    }
}


// 2nd method:
//  String bin=Integer.toBinaryString(n);
//         int count=0;
//         for(int i=0;i<bin.length();i++)
//         {
//             if(bin.substring(i,i+1).equals("1"))
//                 count++;
                
//         }
//         return count;