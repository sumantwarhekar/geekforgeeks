import java.util.*;

class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (i % 2 == 0)
                even += Arr[i];
            else
                odd += Arr[i];
        }
        answer.add(even);
        answer.add(odd);
        return answer;
    }
}