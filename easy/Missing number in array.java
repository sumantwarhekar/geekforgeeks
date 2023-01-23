class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sumOfN = n * (n + 1) / 2;
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i++)
            sumOfArray += array[i];
        return sumOfN - sumOfArray;
    }
}