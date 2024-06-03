/* https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/?envType=daily-question&envId=2024-06-03 */
/* 2486. Append Characters to String to Make Subsequence */

class ApepndCharactersToStringToMakeSubsequence {
    public int appendCharacters(String s, String t) {
    int i = 0; 
    for (final char c : s.toCharArray())
      if (c == t.charAt(i))
        if (++i == t.length())
          return 0;
    return t.length() - i;      
    }
}
