class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for(int i = n-1; i>=0; i--)
        {
           int temp = digits[i] + carry;
           digits[i] = temp % 10;
           carry = temp / 10;
        }

        if(carry != 0)
        {
            int newdigits[] = new int[n + 1];
            newdigits[0] = 1;
            return newdigits;
        }
        return digits;
    }
}