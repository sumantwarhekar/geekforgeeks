class GFG {
    String longest(String names[], int n) {
        int len = 0;
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (len < names[i].length()) {
                answer = names[i];
                len = names[i].length();
            }
        }
        return answer;
    }
}