import java.util.*;

class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder answer = new StringBuilder();
        int givenlength = s.length();
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < givenlength; i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
                letters.add(s.charAt(i));
        }
        int idx = letters.size() - 1;
        for (int i = 0; i < givenlength; i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                answer.append(letters.get(idx));
                idx--;
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}