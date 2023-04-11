class Solution {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2*(long)n + 0.25)-0.5);
    }
}

// Solution 1 : 

// int level=0 , coin=1;
//         while(n>=coin){
//             n-=coin;
//             coin++;
//             level++;
//         }
//         return level;


// Solution 2 :

// long left=0 , right =n;
        // while(left<=right){
        //     long mid = left+(right-left)/2;
        //     long k = mid*(mid+1)/2;
        //     if(k==n)
        //         return (int)mid;
        //     else if(k>n)
        //         right = mid-1;
        //     else
        //         left=mid+1;
        // }
        // return (int)right;