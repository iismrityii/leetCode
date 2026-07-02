class Solution {
    private static void solve(StringBuilder curr, int n, List<String> ans) {
        if(curr.length() == 2*n) {
            if(isValid(curr.toString())) {
                ans.add(curr.toString());
            }
            return;
        }

        curr.append("(");
        solve(curr, n, ans);
        curr.deleteCharAt(curr.length() - 1);
        curr.append(")");
        solve(curr, n, ans);
        curr.deleteCharAt(curr.length() - 1);

    }

    private static boolean isValid(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') count++;
            else count--;
            if(count < 0) return false;
        }

        return count == 0;
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(new StringBuilder(), n, ans);
        return ans;
    }
}