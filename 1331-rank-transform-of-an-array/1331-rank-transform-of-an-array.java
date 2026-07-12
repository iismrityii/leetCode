class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> hm = new HashMap<>();

        int rank = 1;
        for(int num : temp) {
            if(!hm.containsKey(num)) {
                hm.put(num, rank++);
            }
        }

        for(int i = 0; i < n; i++) {
            arr[i] = hm.get(arr[i]);
        }

        return arr;
    }
}