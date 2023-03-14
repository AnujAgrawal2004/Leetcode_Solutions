class Solution {
    public int[] sortedSquares(int[] nums) {
        int p1=0,p2=nums.length-1;
        int output[]=new int[nums.length];
        int curr=nums.length-1;
        while(p1<=p2){
            int left=nums[p1]*nums[p1];
            int right=nums[p2]*nums[p2];
            if(left>right){
                output[curr]=left;
                curr--;
                p1++;
            }
            else{
                output[curr]=right;
                curr--;
                p2--;
            }
        }
        return output;
    }
}