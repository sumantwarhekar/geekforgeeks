class Solution {
    static int getCompundInterest(int P, int T, int N, int R) {
        // code here
        double onePlusRbyN = (1 + ((R / 100.0) / N));
        return (int) (P * Math.pow(onePlusRbyN, N * T));
    }
};