package Queue;

public class minAddToMakeValid921 {
    public int minAddToMakeValid(String s) {
        int res = 0;
        int need = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                need++;
            }
            if (s.charAt(i) == ')') {
                need--;
                if (need == -1) {
                    need =0;
                    res++;
                }
            }
        }
        return res + need;
    }
}
