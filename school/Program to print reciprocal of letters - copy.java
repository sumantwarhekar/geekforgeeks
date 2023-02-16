class Solution {
    static String reciprocalString(String S) {
        // code here
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
                char ch = (char) ('Z' + 'A' - S.charAt(i));
                answer.append(ch);
            } else if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                char ch = (char) ('z' + 'a' - S.charAt(i));
                answer.append(ch);
            } else {
                answer.append(S.charAt(i));
            }
        }
        return answer.toString();
    }
}