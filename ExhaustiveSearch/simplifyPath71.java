package ExhaustiveSearch;

import java.util.LinkedList;

public class simplifyPath71 {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0 || path.charAt(0) != '/') {
            return "";
        }
        char[] chars = path.toCharArray();
        LinkedList<String> list = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; ) {
            /*
            思路是找到两个"/"之间的字符串，然后判断是不是".", ".."，
            如果都不是，就是路径字符串，加进list
            如果是"."，不理会
            如果是".."，在list中有元素的情况下删除最后一个
            最后将list中的所有字符串拼接起来
             */
            if (chars[i] != '/') {
                int j = i + 1;
                while (j < chars.length && chars[j] != '/') {
                    j++;
                }
                String s = new String(chars, i, j - i);
                if (!s.equals(".")) {
                    if (s.equals("..")) {
                        if (list.size() > 0) {
                            list.removeLast();
                        }
                    } else {
                        list.add(s);
                    }
                }
                i = j + 1;
            } else {
                i++;
            }
        }
        if (list.size() == 0) {
            stringBuilder.append("/");
        } else {
            for (String str : list) {
                stringBuilder.append("/").append(str);
            }
        }
        return stringBuilder.toString();
    }
}
