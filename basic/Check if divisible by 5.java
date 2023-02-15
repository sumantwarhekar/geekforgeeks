// Solution 1
class Solution1 {
    static int divisibleBy5(String N) {
        // code here
        char last = N.charAt(N.length() - 1);
        int lastDigit = last - '0';
        if (lastDigit == 0 || lastDigit == 5)
            return 1;
        return 0;
    }
}

// Solution 2
class Solution2 {
    static int divisibleBy5(String N) {
        // code here
        char last = N.charAt(N.length() - 1);
        int lastDigit = Character.getNumericValue(last);
        if (lastDigit == 0 || lastDigit == 5)
            return 1;
        return 0;
    }
}