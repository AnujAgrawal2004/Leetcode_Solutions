class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}