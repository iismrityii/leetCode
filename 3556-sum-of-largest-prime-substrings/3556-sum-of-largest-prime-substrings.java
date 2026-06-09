class Solution {
    private boolean isPrime(long n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(long i = 3; i * i <= n; i+=2) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long sumOfLargestPrimes(String s) {
        HashSet<Long> hs = new HashSet<>();
        long n = 0;
        for(int i = 0; i < s.length(); i++) {
            n = 0;
            for(int j = i; j < s.length(); j++) {
                n = n * 10 + (s.charAt(j) - '0');
                if(isPrime(n)) {
                    hs.add(n);
                }
            }
        }

        ArrayList<Long> arr = new ArrayList<>(hs);
        Collections.sort(arr, Collections.reverseOrder());
        long sum = 0;
        if(arr.size() < 3) {
            for(int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
            } 
        }
        else {
            for(int i = 0; i < 3; i++) {
                sum += arr.get(i);
            }
        }

        return sum;
    }
}