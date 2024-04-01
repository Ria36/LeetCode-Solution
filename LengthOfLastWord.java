/* https://leetcode.com/problems/length-of-last-word/description/?envType=daily-question&envId=2024-04-01 */
/* 58. Length of Last Word */

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
    int i = s.length() - 1;

    while (i >= 0 && s.charAt(i) == ' ')
      --i;
    final int lastIndex = i;
    while (i >= 0 && s.charAt(i) != ' ')
      --i;

    return lastIndex - i;
    }
}
