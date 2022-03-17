package DynamicProgramming;

public class fib509 {
    public int fib(int n) {
        if (n < 1) return 0;
        if(n ==1 || n == 2) return 1;
        int prev = 1, cur = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = cur;
            cur = prev + cur;
            prev = tmp;
        }
        return cur;
    }
}
