class Solution {
    public int longestWPI(int[] hours) {
        if (hours.length == 0) return 0;
        int maxLen = 0;
        Map<Integer, Integer> hm = new HashMap();  
        int sum = 0;  
		
        for (int i = 0; i < hours.length; i++) {
            sum += hours[i] > 8 ? 1 : -1;  
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);  
            }
			
            if (sum > 0) {  
                maxLen = i + 1;
            } else if (hm.containsKey(sum - 1)) { 
                maxLen = Math.max(maxLen, i - hm.get(sum - 1));
            }            
            
        }
        
        return maxLen;
    }
}