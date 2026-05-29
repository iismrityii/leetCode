class Solution {
    public int maximum69Number (int num) {
        int pValue = 0;
        int pValueSix = -1;

        int temp = num;
        while(temp > 0) {
            int r = temp % 10;
            if(r == 6) {
                pValueSix = pValue;
            }

            temp = temp / 10;
            pValue++;
        }

        if(pValue == -1) {
            return num;
        }

        return num + (3 * (int) Math.pow(10, pValueSix));
    }
}