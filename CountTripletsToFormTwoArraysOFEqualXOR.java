/* https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/submissions/1272625687/?envType=daily-question&envId=2024-05-30 */
/* 1442. Count Triplets That Can Form Two Arrays of Equal XOR */

class CountTripletsToFormTwoArraysOFEqualXOR {
    public int countTriplets(int[] arr) {
        int length = arr.length; 
        int[] prefixXor = new int[length + 1]; 
        for (int i = 0; i < length; ++i) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i];
        }
        int count = 0; 
        for (int i = 0; i < length - 1; ++i) {
            for (int j = i + 1; j < length; ++j) {
                for (int k = j; k < length; ++k) {
                  
                    int xorA = prefixXor[j] ^ prefixXor[i];
                    
                    int xorB = prefixXor[k + 1] ^ prefixXor[j];
                  
                    if (xorA == xorB) { 
                        count++; 
                    }
                }
            }
        }

        return count; 
    }
}
