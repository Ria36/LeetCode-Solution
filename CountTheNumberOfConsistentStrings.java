/* https://leetcode.com/problems/count-the-number-of-consistent-strings/?envType=daily-question&envId=2024-09-12 */
/* 1684. Count the Number of Consistent Strings */

class CountTheNumberOfConsistentStrings {
  public int countConsistentStrings(String allowed, String[] words) {
    return (int) Arrays.stream(words)
        .filter(word -> word.matches(String.format("[%s]*", allowed)))
        .count();
  }
}
