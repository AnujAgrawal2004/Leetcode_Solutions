class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String x:strs){
            char arr[] = x.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(!map.containsKey(temp)){
                map.put(temp,new LinkedList<String>());
            }
            map.get(temp).add(x);
        }
        return new LinkedList<>(map.values());
    }
}