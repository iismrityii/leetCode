class Solution {
    public boolean match(String query, String pattern) {
        int i = 0;
        int j = 0;

        while(i < query.length()) {
            char q = query.charAt(i);

            if(j < pattern.length() && q == pattern.charAt(j)) {
                i++;
                j++;
            }
            else if(Character.isLowerCase(q)) {
                i++;
            }
            else {
                return false;
            }
        }

        return j == pattern.length();
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> ans = new ArrayList<>();
        for(String q : queries) {
            ans.add(match(q, pattern));
        }

        return ans;
    }
}