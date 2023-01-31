class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String given = S1+S2;
        String answer="";
        for(int i=given.length()-1;i>=0;i--){
            answer+=given.charAt(i);
        }
        return answer;
    }
}