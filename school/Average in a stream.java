class Solution {
    float[] streamAvg(int[] arr, int n) {
        // code here
        float[] answer = new float[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            answer[i] = (float) sum / (i + 1);
        }
        return answer;
    }
}