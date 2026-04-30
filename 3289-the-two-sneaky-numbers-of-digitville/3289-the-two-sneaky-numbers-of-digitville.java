class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int max=Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int freq[] = new int[max + 1];
        int res[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int k = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] >= 2){
                res[k] = i;
                k++;
            }
        }

        return res;
    }
}