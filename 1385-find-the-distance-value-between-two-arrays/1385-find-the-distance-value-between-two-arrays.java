class Solution {
    boolean isValid(int num, int arr[], int d) {
        for(int n : arr) {
            if(Math.abs(n - num) <= d) {
                return false;
            }
        }
        return true;
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int num : arr1) {
            if(isValid(num, arr2, d)) {
                count++;
            }
        }

        return count;
    }
}