/* https://leetcode.com/problems/longest-ideal-subsequence/?envType=daily-question&envId=2024-04-25 */
/* 2370. Longest Ideal Subsequence */

class LongestIdealSubsequence {
    public int longestIdealString(String s, int k) {
        int lengthOfString = s.length();
        int longestLength = 1; 
        int[] dynamicProgramming = new int[lengthOfString]; 
        Arrays.fill(dynamicProgramming, 1); 
        Map<Character, Integer> lastSeenCharacterMap = new HashMap<>(26);
        lastSeenCharacterMap.put(s.charAt(0), 0);
        for (int i = 1; i < lengthOfString; ++i) {
            char currentChar = s.charAt(i); 
            for (char prevChar = 'a'; prevChar <= 'z'; ++prevChar) {
                // If the absolute difference in ASCII value is within the limit k, we proceed.
                if (Math.abs(currentChar - prevChar) > k) {
                    continue;
                }
                if (lastSeenCharacterMap.containsKey(prevChar)) {
                    dynamicProgramming[i] = Math.max(dynamicProgramming[i], dynamicProgramming[lastSeenCharacterMap.get(prevChar)] + 1);
                }
            }
            lastSeenCharacterMap.put(currentChar, i);
            longestLength = Math.max(longestLength, dynamicProgramming[i]);
        }
        return longestLength; 
    }
}
