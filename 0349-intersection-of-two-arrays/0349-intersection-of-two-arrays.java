class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      ArrayList<Integer> AL = new ArrayList<>();
      HashSet<Integer> set = new HashSet<>();
      for(int i : nums1){
          set.add(i);
      }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                AL.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int ans[]= new int[AL.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=AL.get(i);
        }
        return ans;
    }
}