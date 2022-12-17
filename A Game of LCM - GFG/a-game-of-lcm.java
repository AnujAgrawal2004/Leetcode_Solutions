//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.maxGcd(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long gcd(long a, long b) {

        if (a == 0)

            return b;

        return gcd(b % a, a);

    }

    long maxGcd(int N) {

        long c=1;

        long a = N;

        for(int i=N;i>=1;i--){

           if(gcd(a,i)==1){

               a*=i;

               c++;

           }

           if(c>=4) break;

        }

        return a;

    }
}