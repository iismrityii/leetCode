class Solution {
    private void solve(int idx, String digits, StringBuilder sb, List<String> ans, String map[]) {
        if(idx == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        char digit = digits.charAt(idx);
        String letters = map[digit - '0'];

        for(int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            sb.append(ch);
            solve(idx + 1, digits, sb, ans, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        
        String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        solve(0, digits, new StringBuilder(), ans, map);
        return ans;
    }
}