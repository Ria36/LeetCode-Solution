/* https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/?envType=daily-question&envId=2024-07-11 */
/* 1190. Reverse Substrings Between Each Pair of Parentheses */

class ReverseSubStringsBetweenEachPairOfParanthesis {
    public String reverseParentheses(String s) {
    Deque<Integer> stack = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    for (final char c : s.toCharArray())
      if (c == '(') {
        stack.push(sb.length());
      } else if (c == ')') {
        StringBuilder reversed = new StringBuilder();
        for (int sz = sb.length() - stack.pop(); sz > 0; --sz) {
          reversed.append(sb.charAt(sb.length() - 1));
          sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(reversed);
      } else {
        sb.append(c);
      }
    return sb.toString();
    }
}

