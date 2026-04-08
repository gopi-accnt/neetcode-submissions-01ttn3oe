public class Solution {
    public int reverseBits(int n) {
        int res = 0;
    for (int i = 0; i < 32; i++) {
        // 1. Shift res left to make room for the next bit
        res <<= 1;
        // 2. Get the last bit of n and add it to the end of res
        res |= (n & 1);
        // 3. Discard the bit we just processed from n
        n >>>= 1; // Use >>> to handle negative inputs!
    }
    return res;
    }
}