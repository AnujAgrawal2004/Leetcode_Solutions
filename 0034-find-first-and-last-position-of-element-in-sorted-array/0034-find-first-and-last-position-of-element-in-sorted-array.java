class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        if(nums.length == 0)
         return arr;
        int start=-1;
        int end=-1;
        int per[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                start = i;
                break;
            }
            
        }
        per[0]=start;
        for(int i=nums.length-1;i>=0;i--){
             if(nums[i]==target){
                end = i;
                break;
            }
        }
        per[1]=end;
        return per;
    }
}