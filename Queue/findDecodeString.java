package Queue;

import java.util.Collections;
import java.util.LinkedList;

public class findDecodeString {
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<String>();
        ptr = 0;

        while(ptr < s.length()) {
            char cur = s.charAt(ptr);
            // 处理数字
            if(Character.isDigit(cur)) {
                String digits = getDigits(s);
                stk.addLast(digits);
            } else if(Character.isLetter(cur) || cur == '[') {
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ++ptr;
                LinkedList<String> sub = new LinkedList<String>();
                while(!"[".equals(stk.peekLast())) {
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuffer t = new StringBuffer();
                String o = getString(sub);
                while(repTime-- > 0) {
                    t.append(o);
                }
                stk.addLast(t.toString());
            }
        }
        return getString(stk);
    }

    public String getDigits(String s) {
        StringBuffer ret = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))) {
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }

    public String getString(LinkedList<String> v) {
        StringBuffer ret = new StringBuffer();
        for (String s : v) {
            ret.append(s);
        }
        return ret.toString();
    }
}
