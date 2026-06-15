class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        Arrays.sort(salary);
        int total = 0;

        for(int i = 0; i < n; i++) {
            total += salary[i];
        }

        return (double)(total - salary[0] - salary[n - 1])/(n - 2);
    }
}