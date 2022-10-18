class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        long[][][] dp=new long[jobDifficulty.length+1][d+1][1001];
        for(long[][] x:dp)
         for(long[] y:x) Arrays.fill(y,-1);
         int[] suffix=new int[jobDifficulty.length];
         for(int i=jobDifficulty.length-1;i>=0;i--)
         {
             if(i==jobDifficulty.length-1)
             suffix[i]=jobDifficulty[i];
             else{
                 suffix[i]=Math.max(suffix[i+1],jobDifficulty[i]);
             }
         }
        long ans=helper(jobDifficulty,0,d,Integer.MIN_VALUE,dp,suffix);
        return ans>=Integer.MAX_VALUE?-1:(int)ans;
    }
    public long helper(int[] jobDifficulty,int ind,int d,int max,long[][][]dp,int[] suffix)
    {
        if(ind>=jobDifficulty.length)return Integer.MAX_VALUE;
        if((d-1)==0)
        {
            if(ind<jobDifficulty.length)return suffix[ind];
            return Integer.MAX_VALUE;
        }
        if(max!=Integer.MIN_VALUE && dp[ind][d][max]!=-1)return dp[ind][d][max];
        max=Math.max(max,jobDifficulty[ind]);
        long partition=max+helper(jobDifficulty,ind+1,d-1,Integer.MIN_VALUE,dp,suffix);
        long ntpartition=helper(jobDifficulty,ind+1,d,max,dp,suffix);
        return dp[ind][d][max]=Math.min(partition,ntpartition);
    }
}