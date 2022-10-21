//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] arr)
    {
        // code here
        int[] res = new int[R * C];
        int p = 0;
        
        int rStart = 0;
        int rEnd = R-1;
        
        int cStart = 0;
        int cEnd = C-1;
        
        while(rStart <= rEnd && cStart <= cEnd) {
            for(int i=cStart;i<=cEnd;i++) {
                res[p++] = arr[rStart][i];
            }
            rStart++;
            
            if(rStart > rEnd || cStart > cEnd) {
                break;
            }
            
            for(int i=rStart;i<=rEnd;i++) {
                res[p++] = arr[i][cEnd];
            }
            cEnd--;
            
            if(rStart > rEnd || cStart > cEnd) {
                break;
            }
            
            for(int i=cEnd;i>=cStart;i--) {
                res[p++] = arr[rEnd][i];
            }
            rEnd--;
            
            if(rStart > rEnd || cStart > cEnd) {
                break;
            }
            
            for(int i=rEnd;i>=rStart;i--) {
                res[p++] = arr[i][cStart];
            }
            cStart++;
        }
        
        int i=0;
        int j=res.length-1;
        
        while(i <= j) {
            int temp = res[i];
            res[i] = res[j];
            res[j] = temp;
            
            i++;
            j--;
        }
        
        return res;
    }
    
}