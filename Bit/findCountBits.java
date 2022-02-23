package Bit;

public class findCountBits {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        bits[0] = 0;
        for (int i = 1; i <= n; i++) {
            bits[i] = (i&1) == 1 ? bits[i-1]+1 : bits[i>>1];
        }
        return bits;
    }
}
