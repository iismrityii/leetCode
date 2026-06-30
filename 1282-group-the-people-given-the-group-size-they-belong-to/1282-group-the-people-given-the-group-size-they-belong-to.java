class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for(int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            hm.putIfAbsent(size, new ArrayList<>());
            hm.get(size).add(i);
            if(hm.get(size).size() == size) {
                res.add(new ArrayList<>(hm.get(size)));
                hm.remove(size);
            }
        }
        
        return res;
    }
}