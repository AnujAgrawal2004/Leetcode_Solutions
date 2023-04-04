class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
        if(nums.length<1) return res;
        helper(res,new ArrayList<>(),nums,new boolean[nums.length]);
        return res;
    }
    
    private void helper(List<List<Integer>> res,List<Integer> cur,int nums[],boolean visited[]){
        if(cur.size()==nums.length)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            cur.add(nums[i]);
            visited[i]=true;
            helper(res,cur,nums,visited);
            cur.remove(cur.size()-1);
            visited[i]=false;
        }
    }
}



//  List<List<Integer>> ans = new LinkedList<>();
//         backtrack(ans,new ArrayList<>(),nums);
//         return ans;
//     }
//     public void backtrack(List<List<Integer>> ans,List<Integer> temp,int nums[]){
//       if(temp.size()==nums.length){
//           ans.add(new LinkedList<>(temp));
//       }  
//         else{
//             for(int i=0;i<nums.length;i++){
//                 if(temp.contains(nums[i]))
//                     continue;
//                 temp.add(nums[i]);
//                 backtrack(ans,temp,nums);
        
//                 temp.remove(temp.size()-1);
//             }
//         }