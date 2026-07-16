class Solution {
    private static void solve(int i, String s, List<String> ans, StringBuilder sb) {
        if(i == s.length()) {
            ans.add(sb.toString());
            return;
        }

        char ch = s.charAt(i);
        if (Character.isDigit(ch)) {
            sb.append(ch);
            solve(i + 1, s, ans, sb);
            sb.deleteCharAt(sb.length() - 1);
        } 
        
        else if (Character.isLetter(ch)) {
            sb.append(Character.toLowerCase(ch));
            solve(i + 1, s, ans, sb);
            sb.deleteCharAt(sb.length() - 1);
            
            sb.append(Character.toUpperCase(ch));
            solve(i + 1, s, ans, sb);
            sb.deleteCharAt(sb.length() - 1);
        }        
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        solve(0, s, ans, new StringBuilder());
        return ans;
    }
}