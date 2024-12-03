/* https://leetcode.com/problems/adding-spaces-to-a-string/?envType=daily-question&envId=2024-12-03 */
/* 2109. Adding Spaces to a String */

class AddingSpacesToAString {
  public String addSpaces(String s, int[] spaces) {
    StringBuilder sb = new StringBuilder();
    int j = 0; 
    for (int i = 0; i < s.length(); ++i) {
      if (j < spaces.length && i == spaces[j]) {
        sb.append(' ');
        ++j;
      }
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }
}
