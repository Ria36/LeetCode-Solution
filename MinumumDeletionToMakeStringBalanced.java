/* https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/?envType=daily-question&envId=2024-07-30 */
/* 1653. Minimum Deletions to Make String Balanced */

class MinumumDeletionToMakeStringBalanced {
    public int minimumDeletions(String s) {
    int deleted = 0;
    int countBalanced = 0;
    for (final char c : s.toCharArray())
      if (c == 'a')
        deleted = Math.min(deleted + 1, countBalanced);
      else
        ++countBalanced;
    return deleted;
    }
}
