class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int countF = 0;
        int countT = 0;
        int l = 0;
        int r = 0;
        int ans = 0;

        while(r < n) {
            if(answerKey.charAt(r) == 'F') {
                countF++;
            } else {
                countT++;
            }
            
            while(Math.min(countF, countT) > k) {
                if(answerKey.charAt(l) == 'F') {
                    countF--;
                } else {
                    countT--;
                }
                l++;
            }
            ans = Math.max(ans, countF + countT);
            r++;
        }

        return ans;
    }
}