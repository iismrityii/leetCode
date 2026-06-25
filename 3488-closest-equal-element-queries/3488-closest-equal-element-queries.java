class Solution {
    private int binSearch(List<Integer> list, int target) {
        int l = 0;
        int r = list.size() - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            int midVal = list.get(mid);
            if(midVal == target) {
                return mid;
            } else if(midVal < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for(int i = 0; i < n; i++) {
            hm.putIfAbsent(nums[i], new ArrayList<>());
            hm.get(nums[i]).add(i);
        }

        for(int i = 0; i < queries.length; i++) {
            int idx = queries[i];
            int val = nums[idx];

            List<Integer> ind = hm.get(val);
            if(ind.size() == 1) {
                ans.add(-1);
                continue;
            }

            int pos = binSearch(ind, idx);
            int size = ind.size();

            int prevIdx = ind.get((pos - 1 + size) % size);
            int nextIdx = ind.get((pos + 1) % size);

            int prevDis = Math.min(Math.abs(idx - prevIdx), n - Math.abs(idx - prevIdx));
            int nextDis = Math.min(Math.abs(idx - nextIdx), n - Math.abs(idx - nextIdx));

            ans.add(Math.min(prevDis, nextDis));
        }

        return ans;
    }
}