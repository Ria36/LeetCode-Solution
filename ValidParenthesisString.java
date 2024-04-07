/* https://leetcode.com/problems/valid-parenthesis-string/?envType=daily-question&envId=2024-04-07 */
/* 678. Valid Parenthesis String */


class ValidParenthesisString {
    public boolean checkValidString(String s) {
    int low = 0;  
    int high = 0; 

    for (final char c : s.toCharArray()) {
      switch (c) {
        case '(':
          ++low;
          ++high;
          break;
        case ')':
          low = Math.max(0, --low);
          --high;
          break;
        case '*':
          low = Math.max(0, --low);
          ++high;
          break;
      }
      if (high < 0)
        return false;
    }

    return low == 0;
    }
}
