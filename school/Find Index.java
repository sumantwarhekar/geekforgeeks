class Solution {
    // Function to find starting and end index
    static int[] findIndex(int a[], int N, int key) {
        // code here.
        int[] result = new int[2];
        int indexFromStart = -1;
        int indexFromEnd = -1;
        for (int i = 0; i < N; i++) {
            if (a[i] == key && indexFromStart == -1) {
                indexFromStart = i;
            }
            if (a[i] == key) {
                indexFromEnd = i;
            }
        }
        result[0] = indexFromStart;
        result[1] = indexFromEnd;
        return result;
    }
}