class Solution {
    public String reversePrefix(String s, int k) {
        char str[] = s.toCharArray();
        int l = 0;
        int r = k - 1;

        while(l < r) {
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        
        return new String(str);
    }
}   