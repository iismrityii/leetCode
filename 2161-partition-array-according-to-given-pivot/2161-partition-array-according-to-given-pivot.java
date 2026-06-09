class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int ans[] = new int[n];

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> eq = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int num : nums) {
            if(num < pivot) {
                left.add(num);
            } else if(num > pivot) {
                right.add(num);
            } else {
                eq.add(num);
            }
        }

        int i = 0;
        for(int num : left) {
            ans[i++] = num;
        }
        
        for(int num : eq) {
            ans[i++] = num;
        }

        for(int num : right) {
            ans[i++] = num;
        }

        return ans;
    }
}