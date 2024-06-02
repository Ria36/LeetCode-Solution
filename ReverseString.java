/* https://leetcode.com/problems/reverse-string/?envType=daily-question&envId=2024-06-02 */
/* 344. Reverse String */

class ReverseString {
    public void reverseString(char[] s) {
    int l = 0;
    int r = s.length - 1;

    while (l < r) {
      char temp = s[l];
      s[l++] = s[r];
      s[r--] = temp;
    }
    }
}
