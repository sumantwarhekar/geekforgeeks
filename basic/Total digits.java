class Solution {
    static long totalDigits(long n) {
        // code here
        long answer = 0;
        for (int i = 1; i <= n; i++) {
            String number = Integer.toString(i);
            answer += number.length();
        }
        return answer;
    }
}