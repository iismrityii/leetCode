class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        HashSet<Character> hs = new HashSet<>();
        int freq[] = new int[26];

        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            freq[curr - 'a']--;

            if(hs.contains(curr)) {
                continue;
            }

            while(!st.isEmpty() && st.peek() > curr && freq[st.peek() - 'a'] > 0) {
                char top = st.pop();
                hs.remove(top);
            }

            st.push(curr);
            hs.add(curr);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}