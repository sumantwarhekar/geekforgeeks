class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        int len = str.length();
        String result = "";
        for (int i = len - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}