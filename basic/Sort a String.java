import java.util.*;

class Solution {
    String sort(String s) {
        char[] letters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);
        }
        StringBuilder answer = new StringBuilder();
        Arrays.sort(letters);
        for (int i = 0; i < s.length(); i++) {
            answer.append(letters[i]);
        }
        return answer.toString();
    }
}