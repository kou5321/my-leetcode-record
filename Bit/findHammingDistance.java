package Bit;

public class findHammingDistance {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        for (int xor = x ^ y; xor != 0; xor &= (xor-1)) {
            distance++;
        }
        return distance;
    }
}
