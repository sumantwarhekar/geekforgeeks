class Solution {
    static int isPrime(int N) {
        // code here
        if (N == 1)
            return 0;
        int counter = 0;
        int n = (int) Math.floor(Math.sqrt(N));
        for (int i = 2; i <= n; i++) {
            if (N % i == 0) {
                counter++;
            }
        }
        if (counter == 0)
            return 1;
        else
            return 0;
    }
}