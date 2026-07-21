class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int freq[] = new int[hm.size()];
        int i = 0;
        for(int key : hm.keySet()) {
            freq[i++] = hm.get(key);
        }

        Arrays.sort(freq);
        int count = 0;
        int removed = 0;

        for(int j = freq.length - 1; j >= 0; j--) {
            removed += freq[j];
            count++;

            if(removed >= n / 2) {
                break;
            }
        }

        return count;
    }
}