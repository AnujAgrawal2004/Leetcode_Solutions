//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        ArrayList<Integer> AL =new ArrayList<>();
        int max = 0;
        int start = 0;
        int end = 0;
        int curStart = 0;
        int curSum = 0;
        for(int i=0;i<n;i++){
           if(a[i]<0){
           curSum=0;
           curStart = i+1;
           }
           else{
               curSum+=a[i];
           }
           if(curSum > max){
               max=curSum;
               start = curStart;
               end = i+1;
           }
           else if(curSum == max){
               int currDis = i+1-curStart;
               int maxDis = end - start;
               if(currDis>maxDis){
                   start = curStart;
                   end = i+1;
               }
           }
        }
        for(int i=start;i<end;i++)
        AL.add(a[i]);
        if(AL.size()==0)
        AL.add(-1);
        return AL;
        
    }
}