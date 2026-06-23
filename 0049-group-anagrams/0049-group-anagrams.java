class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> hm = new HashMap<>();

        for(String s : strs) {
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            hm.putIfAbsent(map, new ArrayList<>());
            hm.get(map).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}