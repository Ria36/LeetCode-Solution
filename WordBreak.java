/* https://leetcode.com/problems/word-break/ */
/*
139. Word Break

Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Note that the same word in the dictionary may be reused multiple times in the segmentation.

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".

Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.

Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
 
Constraints:
1 <= s.length <= 300
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 20
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique.
*/
class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, new HashSet<>(wordDict), new HashMap<>());
    }
    private boolean wordBreak(final String s, Set<String> wordSet, Map<String, Boolean> memo) {
    if (memo.containsKey(s))
      return memo.get(s);
    if (wordSet.contains(s)) {
      memo.put(s, true);
      return true;
    }

    // 1 <= prefix.length() < s.length()
    for (int i = 1; i < s.length(); ++i) {
      final String prefix = s.substring(0, i);
      final String suffix = s.substring(i);
      if (wordSet.contains(prefix) && wordBreak(suffix, wordSet, memo)) {
        memo.put(s, true);
        return true;
      }
    }

    memo.put(s, false);
    return false;
    }
}
