package Queue;

import java.util.Stack;

public class dailyTemperatures739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};
        int[] ret = dailyTemperatures(temp);
        System.out.println(ret);
    }
}
