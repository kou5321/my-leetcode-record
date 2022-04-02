public class ValidPalindromeII680 {
    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalidrome(s, left+1, right) || isPalidrome(s, left, right-1);
            }
        }
        return true;
    }

    public static boolean isPalidrome(String s, int left, int right) {
        while(left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
}
