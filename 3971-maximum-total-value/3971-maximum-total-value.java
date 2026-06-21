class Solution {
    static final long MOD = 1_000_000_007L;
    private long countGains(int[] value, int[] decay, long threshold) {
        long count = 0;

        for(int i = 0; i < value.length; i++) {
            long a = value[i];
            long d = decay[i];

            if(a < threshold) continue;
            count += (a - threshold) / d + 1;
        }

        return count;
    }

    public int maxTotalValue(int[] value, int[] decay, int m) {
        long low = 1;
        long high = 0;

        for(int v : value) {
            high = Math.max(high, v);
        }

        while(low <= high) {
            long mid = low + (high - low) / 2;

            if(countGains(value, decay, mid) >= m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long threshold = high;

        long total = 0;
        long greaterCount = 0;
        long equalCount = 0;

        for(int i = 0; i < value.length; i++) {
            long a = value[i];
            long d = decay[i];

            if(a > threshold) {
                long cnt = (a - (threshold + 1)) / d + 1;
                long last = a - (cnt - 1) * d;
                long sum = cnt * (a + last) / 2;

                total += sum;
                greaterCount += cnt;
            }

            if(a >= threshold) {
                long diff = a - threshold;
                if(diff % d == 0) {
                    long k = diff / d;
                    if(a - k * d == threshold) {
                        equalCount++;
                    }
                }
            }
        }

        long need = Math.min((long)m - greaterCount, equalCount);
        if(need > 0) {
            total += need * threshold;
        }

        return (int)(total % MOD);
    }
}