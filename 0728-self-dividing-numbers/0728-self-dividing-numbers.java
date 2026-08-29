class Solution {
    public List<Integer> selfDividingNumbers(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (check(i)) list.add(i);
        }
        return list;
    }

    public boolean check(int num) {
        int n = num;
        while (n != 0) {
            int d = n % 10;
            if (d == 0 || num % d != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }
}