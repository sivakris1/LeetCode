class Solution {
    public int bitwiseComplement(int n) {
        // Edge case: if n is 0, binary is "0", complement is "1"
        if (n == 0) return 1;
        
        // Find the bitmask (e.g., if n=5 (101), mask=7 (111))
        int mask = 0;
        int temp = n;
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        
        // XOR flips the bits: 101 ^ 111 = 010
        return n ^ mask;
    }
}
