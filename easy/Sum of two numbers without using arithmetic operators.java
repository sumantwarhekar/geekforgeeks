class Solution {
    int sum(int a, int b) {
        // code here
        int carry;
        while (b > 0) {
            carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}