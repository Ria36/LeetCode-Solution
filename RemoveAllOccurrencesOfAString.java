/* https://leetcode.com/problems/remove-all-occurrences-of-a-substring/submissions/1539283730/?envType=daily-question&envId=2025-02-11 */
/* 1910. Remove All Occurrences of a Substring */

class RemoveAllOccurrencesOfAString {
  public String removeOccurrences(String s, String part) {
    final int n = s.length();
    final int k = part.length();
    StringBuilder sb = new StringBuilder(s);
    int j = 0; 
    for (int i = 0; i < n; ++i) {
      sb.setCharAt(j++, s.charAt(i));
      if (j >= k && sb.substring(j - k, j).toString().equals(part))
        j -= k;
    }
    return sb.substring(0, j).toString();
  }
}
