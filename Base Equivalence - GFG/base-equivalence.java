//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int m = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.baseEquiv(n,m));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    private int findLog(int number,int base){
        return (int)((Math.log(number)/Math.log(base)));
    }
    String baseEquiv(int n, int m)
    {
        // code here
       for(int base=2;base<=32;base++){
           int log=findLog(n,base)+1;
           if(log==m)
           return "Yes";
       }
        return "No";
    }
   
}