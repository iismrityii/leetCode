class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();

        if(sum > 9 * num) return "";

        while (num > 0) {
            int digit = Math.min(9, sum);   
            sb.append(digit);
            sum -= digit;
            num--;
        }

        return sum == 0 ? sb.toString() : "";
    }
}