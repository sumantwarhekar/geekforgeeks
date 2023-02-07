class Solution {
    String firstAlphabet(String S) {
        // code here
        String answer="";
        answer+=S.charAt(0);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==' ')
                answer+=S.charAt(i+1);
        }
        return answer;
    }
};