class Solution {
    static long factorial(int N) {
        // code here
        long answer = 1;
        int i = 1;
        while (i <= N) {
            answer *= i;
            i++;
        }
        return answer;
    }
}