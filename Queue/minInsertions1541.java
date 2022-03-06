package Queue;

public class minInsertions1541 {
    public int minInsertions(String s) {
        int res = 0; // 左括号
        int need = 0; // 右括号
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                need += 2;
                if (need % 2 == 1) {
                    need--;
                    res++;
                }
            }
            if (s.charAt(i) == ')') {
                need--;
                if (need == -1) {
                    need = 1;
                    res++;
                }
            }
        }
        return res + need;
    }
}
