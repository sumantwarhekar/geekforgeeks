class Solution {
    static int evenlyDivides(int N) {
        // code here
        int answer = 0;
        int given = N;
        while (N != 0) {
            int rem = N % 10;
            if (rem > 0 && given % rem == 0)
                answer++;
            N /= 10;
        }
        return answer;
    }
}