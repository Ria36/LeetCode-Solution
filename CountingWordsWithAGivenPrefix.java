/* https://leetcode.com/problems/counting-words-with-a-given-prefix/?envType=daily-question&envId=2025-01-09 */
/* 2185. Counting Words With a Given Prefix */

class CountingWordsWithAGivenPrefix {
  public int prefixCount(String[] words, String pref) {
    return (int) Arrays.stream(words).filter(w -> w.startsWith(pref)).count();
  }
}
