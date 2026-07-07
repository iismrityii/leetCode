class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != '0') {
                sb.append(ch);
            }
        }

        if (sb.length() == 0) {
            return 0;
        }

        long x = Long.parseLong(sb.toString());
        long sum = 0;
        long temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x * sum;
    }
}