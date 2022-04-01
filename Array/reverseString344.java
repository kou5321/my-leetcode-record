package Array;

public class reverseString344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while(left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}
