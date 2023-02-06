class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shuffle[]=new int[nums.length];
        int j=n,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                
                shuffle[i]=nums[k];
                k++;
            }
            else{
                shuffle[i]=nums[j];
           j++;
            }
        }
        return shuffle;
    }
}