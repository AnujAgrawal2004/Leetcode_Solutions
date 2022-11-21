class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int n=Math.abs(nums[i]);
            if(nums[n-1]<0)
                list.add(n);
            else
                nums[n-1]=-nums[n-1];
        }
        return list;
    }
}