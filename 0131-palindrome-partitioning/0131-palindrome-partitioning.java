class Solution {
    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private void isValid(int i, String s, List<List<String>> ans, List<String> temp) {
        if(i == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int j = i; j < s.length(); j++) {
            String part = s.substring(i, j + 1);
            if(isPalindrome(part)) {
                temp.add(part);
                isValid(j + 1, s, ans, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        isValid(0, s, ans, new ArrayList<>());
        return ans;
    }
}