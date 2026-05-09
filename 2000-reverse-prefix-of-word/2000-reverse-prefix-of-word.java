class Solution {
    private String reverseString(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }

    public String reversePrefix(String word, char ch) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                String prefix = word.substring(0, i + 1);
                String suffix = word.substring(i + 1);

                return reverseString(prefix) + suffix;
            }
        }

        return word;
    }
}