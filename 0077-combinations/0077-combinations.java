class Solution {
    private void solve(int i, List<Integer> temp, List<List<Integer>> ans, int arr[], int k) {
        if(temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(i == arr.length) {
            return;
        }

        temp.add(arr[i]);
        solve(i + 1, temp, ans, arr, k);
        temp.remove(temp.size() - 1);
        solve(i + 1, temp, ans, arr, k);
    }

    public List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        List<List<Integer>> ans = new ArrayList<>();
        solve(0, new ArrayList<>(), ans, arr, k);
        return ans;
    }
}